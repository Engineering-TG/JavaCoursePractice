package com.engineering.commerce.services;

import java.util.List;

import com.engineering.commerce.daos.ProductCategoryDAO;
import com.engineering.commerce.entities.ProductCategory;

public class ProductCategoryService {
    
    ProductCategoryDAO productCategoryDAO;

    public ProductCategoryService(){
        productCategoryDAO = new ProductCategoryDAO(true);
    }

    public List<ProductCategory> getAllProductCategories() {
        return productCategoryDAO.getAllProductCategories();
    }
}
