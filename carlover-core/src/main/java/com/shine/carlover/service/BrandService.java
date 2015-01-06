package com.shine.carlover.service;

import com.shine.carlover.base.pager.Pager;
import com.shine.carlover.po.Brand;

/**
 * Created by fuzhaohui on 14/11/28.
 * 汽车品牌服务
 */
public interface BrandService {

    public void addBrand(Brand brand);
    public void editBrand(Brand brand);
    public void deleteBrandById(String BrandId);
    public Brand queryBrandById(String BrandId);
    public Pager<Brand> queryBrand(String searchParams, int pno, int psize);

}
