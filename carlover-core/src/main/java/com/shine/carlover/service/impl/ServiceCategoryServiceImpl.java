package com.shine.carlover.service.impl;

import com.shine.carlover.base.pager.Pager;
import com.shine.carlover.dao.ServiceCategoryDao;
import com.shine.carlover.po.ServiceCategory;
import com.shine.carlover.service.ServiceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by fuzhaohui on 14/11/28.
 * 服务类型服务
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ServiceCategoryServiceImpl implements ServiceCategoryService {

    @Autowired
    private ServiceCategoryDao serviceCategoryDao;

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void addServiceCategory(ServiceCategory serviceCategory) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void editServiceCategory(ServiceCategory serviceCategory) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void deleteServiceCategory(String serviceCategoryId) {

    }

    @Transactional(readOnly=true)
    @Override
    public ServiceCategory queryServiceCategoryById(String serviceCategoryId) {
        return null;
    }

    @Transactional(readOnly=true)
    @Override
    public List<ServiceCategory> queryServiceCategory(String searchParam) {
        return null;
    }

    @Transactional(readOnly=true)
    @Override
    public Pager<ServiceCategory> queryServiceCategoryByStore(String storeId, int pno, int psize) {
        return null;
    }

}
