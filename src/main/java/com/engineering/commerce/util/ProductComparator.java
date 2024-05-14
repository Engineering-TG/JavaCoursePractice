package com.engineering.commerce.util;

import java.util.Comparator;

import com.engineering.commerce.entities.Product;

public class ProductComparator implements Comparator<Product>{

	@Override
	public int compare(Product product1, Product product2) {
		return product1.getId().compareTo(product2.getId());
	}

}
