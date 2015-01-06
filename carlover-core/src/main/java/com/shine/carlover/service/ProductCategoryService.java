package com.shine.carlover.service;

import com.shine.carlover.po.ProductCategory;

import java.util.List;

/**
 * Created by fuzhaohui on 14/11/28.
 * 产品分类服务
 */
public interface ProductCategoryService {

    public void addProductCategory(ProductCategory productCategory);
    public void editProductCategory(ProductCategory productCategory);
    public void deleteProductCategory(String productCategoryId);

    public List<ProductCategory> queryProductCategoryByStore(String storeId);


}
