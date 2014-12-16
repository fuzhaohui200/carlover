package com.shine.automotive.service.impl;

import com.shine.automotive.dao.ProductCategoryDao;
import com.shine.automotive.po.ProductCategory;
import com.shine.automotive.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by fuzhaohui on 14/11/28.
 * 产品分类服务
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS,  readOnly = true)
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void addProductCategory(ProductCategory productCategory) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void editProductCategory(ProductCategory productCategory) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void deleteProductCategory(String productCategoryId) {

    }

    @Transactional(readOnly=true)
    @Override
    public List<ProductCategory> queryProductCategoryByStore(String storeId) {
        return null;
    }


}
