package com.engineering.commerce.controllers;

import java.util.List;

import com.engineering.commerce.services.ProductCategoryService;
import com.engineering.commerce.entities.ProductCategory;

public class ProductCategoryController {
    ProductCategoryService productCategoryService;

    public List<ProductCategory> getAllProductCategories(){
        return productCategoryService.getAllProductCategories();
    }
}