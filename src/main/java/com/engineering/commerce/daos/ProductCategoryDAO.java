package com.engineering.commerce.daos;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.engineering.commerce.entities.ProductCategory;
import com.engineering.commerce.entities.Order;
import com.engineering.commerce.entities.Product;
import com.google.gson.Gson;

public class ProductCategoryDAO {

    private List<ProductCategory> productCategories = new ArrayList<ProductCategory>();

    public ProductCategoryDAO() {

    }

    public ProductCategoryDAO(Boolean init){
        if(init){
            this.initProductCategories();
        }
    }

    /*Loads Product categories into ArrayList */
    private void initProductCategories(){
        try (Reader reader = new InputStreamReader(this.getClass().getResourceAsStream("/productCategories.json"))) {
			Collections.addAll(productCategories, new Gson().fromJson(reader, ProductCategory[].class));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    /* Returns ArrayList with all available Product categories*/
    public List<ProductCategory> getAllProductCategories(){
        return productCategories; 
    }

    //add new product category
    public void addProductCategory(ProductCategory productCategory){
        productCategories.add(productCategory);
    }

    //delete product category
    public void deleteProductCategory(String id){
        productCategories.removeIf(productCategory -> productCategory.getId().equals(id));
        //System.out.println(productCategories.removeIf(productCategory -> productCategory.getId().equals(id)));
    } 

    //return product category by id

    public ProductCategory getProductCategorybyId(String Id){
        Optional<ProductCategory> selectedCategory = productCategories.stream().filter(c -> c.getId().equals(Id)).findFirst();
        
        return selectedCategory.orElse(null);
    }
}
