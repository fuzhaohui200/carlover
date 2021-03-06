package com.shine.carlover.service.impl;

import com.shine.carlover.base.pager.Pager;
import com.shine.carlover.dao.BrandDao;
import com.shine.carlover.po.Brand;
import com.shine.carlover.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by fuzhaohui on 14/11/28.
 * 汽车品牌服务
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS,  readOnly = true)
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandDao brandDao;

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void addBrand(Brand brand) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void editBrand(Brand brand) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void deleteBrandById(String BrandId) {

    }

    @Transactional(readOnly=true)
    @Override
    public Brand queryBrandById(String BrandId) {
        return null;
    }

    @Transactional(readOnly=true)
    @Override
    public Pager<Brand> queryBrand(String searchParams, int pno, int psize) {
        return null;
    }

}
