package com.shine.automotive.service;

import com.shine.automotive.po.Product;

import java.util.List;

/**
 * Created by fuzhaohui on 14/11/28.
 */
public interface ProductService {

    public void addProduct(Product product);
    public void editProduct(Product product);
    public void deleteProduct(String productId);
    public void deleteProductByCategoryId(String categoryId);
    public List<Product> queryProductByCategoryId(String categoryId);
    public List<Product> queryProductByProductName(String productName);

}
