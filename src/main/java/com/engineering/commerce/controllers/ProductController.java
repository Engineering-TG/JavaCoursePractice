package com.engineering.commerce.controllers;

import java.util.List;

import com.engineering.commerce.entities.Product;
import com.engineering.commerce.services.ProductService;

public class ProductController {
	
	ProductService productService;
	
	public ProductController() {
		productService = new ProductService();
	}
	
	public Product getProductById() {
		return null;
	}
	
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	
	/**
	 * Add new product.
	 * @param product
	 */
	public void addProduct(Product product) {
		productService.addProduct(product);
	}
	
	/**
	 * Removes the given product from the list.
	 * @param product
	 */
	public void deleteProduct(Product product) {
		productService.deleteProduct(product);
	}
	
	/**
	 * Return the product that matches the given SKU.
	 * @param sku
	 */
	public Product getProductBySku(String sku) {
		return productService.getProductBySku(sku);
	}
}
