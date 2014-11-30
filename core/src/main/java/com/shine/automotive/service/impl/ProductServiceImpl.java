package com.shine.automotive.service.impl;

import com.shine.automotive.base.pager.Pager;
import com.shine.automotive.dao.ProductDao;
import com.shine.automotive.po.Product;
import com.shine.automotive.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by fuzhaohui on 14/11/28.
 * 产品服务
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS,  readOnly = true)
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void addProduct(Product product) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void editProduct(Product product) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void deleteProduct(String productId) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void deleteProductByCategoryId(String categoryId) {

    }

    @Transactional(readOnly=true)
    @Override
    public List<Product> queryProductByCategoryId(String categoryId) {
        return null;
    }

    public List<Product> queryProductByProductName(String productName) {
        return null;
    }

    public Pager<Product> queryProductByProductCategory(String productCategoryId, int pno, int psize) {
        return null;
    }

}
