package com.engineering.commerce.entities;

import java.util.List;

public class Product {
    private String id;
    private String sku;
    private String name;
//    private ProductType productType;
    private List<ProductCategory> categories;
//    private ProductState state;
    private List<Price> prices;

    public Product() {
	}
    
    public Product(String sku){
    	this.sku = sku;
    }
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ProductCategory> getCategories() {
        return categories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategories(List<ProductCategory> categories) {
        this.categories = categories;
    }

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public List<Price> getPrices() {
		return prices;
	}

	public void setPrices(List<Price> prices) {
		this.prices = prices;
	}

}