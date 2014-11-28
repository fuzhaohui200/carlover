package com.shine.automotive.service;

import com.shine.automotive.po.Store;

import java.util.List;

/**
 * Created by fuzhaohui on 14/11/28.
 */
public interface StoreService {

    public void addStore(Store store);
    public void editStore(Store store);
    public void deleteStore(String storeId);
    public Store queryStoreById(String storeId);
    public List<Store> queryStores(String storeName);
}
