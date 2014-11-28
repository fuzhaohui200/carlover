package com.shine.automotive.service;

import com.shine.automotive.base.pager.Pager;
import com.shine.automotive.po.Brand;

/**
 * Created by fuzhaohui on 14/11/28.
 */
public interface BrandService {

    public void addBrand(Brand brand);
    public void editBrand(Brand brand);
    public void deleteBrandById(String BrandId);
    public Brand queryBrandById(String BrandId);
    public Pager<Brand> queryBrand(String searchParams, int pno, int psize);

}
