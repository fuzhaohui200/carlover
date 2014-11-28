package com.shine.automotive.service;

import com.shine.automotive.po.ProductCategory;

import java.util.List;

/**
 * Created by fuzhaohui on 14/11/28.
 */
public interface ProductCategoryService {

    public void addProductCategory(ProductCategory productCategory);
    public void editProductCategory(ProductCategory productCategory);
    public void deleteProductCategory(String productCategoryId);

    public List<ProductCategory> queryProductCategoryByStore(String storeId);


}
