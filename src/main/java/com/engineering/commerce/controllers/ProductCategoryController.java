package com.engineering.commerce.controllers;

import java.util.List;

import com.engineering.commerce.services.ProductCategoryService;
import com.engineering.commerce.entities.ProductCategory;

public class ProductCategoryController {
    ProductCategoryService productCategoryService = new ProductCategoryService();

    public List<ProductCategory> getAllProductCategories(){
        return productCategoryService.getAllProductCategories();
    }

    public ProductCategory getproductCaregorybyId(String Id){
        return productCategoryService.getproductCategorybyId(Id);
    }

    public void deleteProductCategory(String Id){
        productCategoryService.deleteProductCategory(Id);
    }
}