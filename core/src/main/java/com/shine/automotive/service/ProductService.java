package com.shine.automotive.service;

import com.shine.automotive.base.pager.Pager;
import com.shine.automotive.po.Product;

import java.util.List;

/**
 * Created by fuzhaohui on 14/11/28.
 * 产品服务
 */
public interface ProductService {

    public void addProduct(Product product);
    public void editProduct(Product product);
    public void deleteProduct(String productId);
    public void deleteProductByCategoryId(String categoryId);
    public List<Product> queryProductByCategoryId(String categoryId);
    public List<Product> queryProductByProductName(String productName);

    public Pager<Product> queryProductByProductCategory(String productCategoryId, int pno, int psize);

}
