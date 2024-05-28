package com.engineering.commerce.daos;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.engineering.commerce.entities.ProductCategory;
import com.engineering.commerce.entities.Product;
import com.google.gson.Gson;

public class ProductCategoryDAO {

    private List<ProductCategory> productCategories = new ArrayList<ProductCategory>();
    private List<Product> products = new ArrayList<Product>();

    public ProductCategoryDAO() {

    }

    public ProductCategoryDAO(Boolean init){
        if(init){
            this.initProductCategories();
        }
    }

    /*Loads Product categories into ArrayList */
    private void initProductCategories(){
        try (Reader reader = new InputStreamReader(this.getClass().getResourceAsStream("/products.json"))) {
			Collections.addAll(products, new Gson().fromJson(reader, Product[].class));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    /* Returns ArrayList with all available Product categories*/
    public List<ProductCategory> getAllProductCategories(){
        return productCategories; 
    }
}
