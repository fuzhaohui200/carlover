package com.shine.carlover.service.impl;

import com.shine.carlover.base.pager.Pager;
import com.shine.carlover.dao.StoreDao;
import com.shine.carlover.mongo.StoreCoordinate;
import com.shine.carlover.po.Store;
import com.shine.carlover.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by fuzhaohui on 14/11/28.
 * 4S店管理
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS,  readOnly = true)
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreDao storeDao;

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void addStore(Store store) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void editStore(Store store) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void deleteStore(String storeId) {

    }

    @Transactional(readOnly=true)
    @Override
    public Store queryStoreById(String storeId) {
        return null;
    }

    @Transactional(readOnly=true)
    @Override
    public Pager<Store> queryStores(String storeName, int pno, int psize) {
        return null;
    }

    @Transactional(readOnly=true)
    @Override
    public Pager<StoreCoordinate> queryStoresByNearby(double lng, double lat, int distance, int pno, int psize) {
        return null;
    }
}
