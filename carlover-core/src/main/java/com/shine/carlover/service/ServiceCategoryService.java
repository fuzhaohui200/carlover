package com.shine.carlover.service;

import com.shine.carlover.base.pager.Pager;
import com.shine.carlover.po.ServiceCategory;

import java.util.List;

/**
 * Created by fuzhaohui on 14/11/28.
 * 服务类型服务
 */
public interface ServiceCategoryService {

    public void addServiceCategory(ServiceCategory serviceCategory);
    public void editServiceCategory(ServiceCategory serviceCategory);
    public void deleteServiceCategory(String serviceCategoryId);
    public ServiceCategory queryServiceCategoryById(String serviceCategoryId);
    public List<ServiceCategory> queryServiceCategory(String searchParam);

    public Pager<ServiceCategory> queryServiceCategoryByStore(String storeId, int pno, int psize);

}
