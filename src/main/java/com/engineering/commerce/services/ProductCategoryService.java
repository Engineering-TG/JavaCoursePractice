package com.engineering.commerce.services;

import java.util.List;

import com.engineering.commerce.daos.ProductCategoryDAO;
import com.engineering.commerce.entities.ProductCategory;

public class ProductCategoryService {
    
    ProductCategoryDAO productCategoryDAO;

    public ProductCategoryService(){
        productCategoryDAO = new ProductCategoryDAO(true);
    }

    public ProductCategory getproductCategorybyId(String Id){
        return productCategoryDAO.getProductCategorybyId(Id);
    }

    public void deleteProductCategory(String Id){
        productCategoryDAO.deleteProductCategory(Id);
    }

    public List<ProductCategory> getAllProductCategories() {
        return productCategoryDAO.getAllProductCategories();
    }
}
