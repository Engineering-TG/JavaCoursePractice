package com.engineering.commerce.daos;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.engineering.commerce.entities.Product;
import com.engineering.commerce.util.ProductComparator;
import com.google.gson.Gson;

public class ProductDAO {

	private List<Product> products = new ArrayList<Product>();

	/**
	 * Default Constructor.
	 */
	public ProductDAO() {
	}

	/**
	 * Custom Constructor
	 * 
	 * @param init Boolean to determine whether the products list is loaded or not.
	 */
	public ProductDAO(Boolean init) {
		if (init) {
			this.initProducts();
		}
	}

	/**
	 * Loads the products json file into an ArrayList.
	 */
	private void initProducts() {
		try (Reader reader = new InputStreamReader(this.getClass().getResourceAsStream("/products.json"))) {
			Collections.addAll(products, new Gson().fromJson(reader, Product[].class));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Return an Arraylist with all the available products.
	 * 
	 * @return
	 */
	public List<Product> getAllProducts() {
		return products;
	}

	/**
	 * Add new product.
	 * @param product
	 */
	public void addProduct(Product product) {
		products.add(product);
	}
	
	/**
	 * Removes the given product from the list.
	 * @param product
	 */
	public void deleteProduct(Product product) {
		int index = Collections.binarySearch(products, product, new ProductComparator());
		//int index = Collections.binarySearch(products, product, Comparator.comparing(Product::getId));
		products.remove(index);
	}
	
	/**
	 * Return the product that matches the given SKU.
	 * @param sku
	 */
	public Product getProductBySku(String sku) {
		int index = Collections.binarySearch(products, new Product(sku), Comparator.comparing(Product::getSku));
		return products.get(index);
	}
	
}
