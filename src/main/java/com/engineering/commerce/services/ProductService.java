package com.engineering.commerce.services;

import java.util.List;

import com.engineering.commerce.daos.ProductDAO;
import com.engineering.commerce.entities.Product;

public class ProductService {
	
	ProductDAO productDAO;
	
	public ProductService() {
		productDAO = new ProductDAO(true);
	}
	
	public Product getProductById() {
		return null;
	}
	
	public List<Product> getAllProducts() {
		return productDAO.getAllProducts();
	}
	
	/**
	 * Add new product.
	 * @param product
	 */
	public void addProduct(Product product) {
		productDAO.addProduct(product);
	}
	
	/**
	 * Removes the given product from the list.
	 * @param product
	 */
	public void deleteProduct(Product product) {
		productDAO.deleteProduct(product);
	}
	
	/**
	 * Return the product that matches the given SKU.
	 * @param sku
	 */
	public Product getProductBySku(String sku) {
		return productDAO.getProductBySku(sku);
	}
}
