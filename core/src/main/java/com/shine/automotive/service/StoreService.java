package com.shine.automotive.service;

import com.shine.automotive.base.pager.Pager;
import com.shine.automotive.mongo.StoreCoordinate;
import com.shine.automotive.po.Store;

/**
 * Created by fuzhaohui on 14/11/28.
 */
public interface StoreService {

    /**
     *
     * @param store
     */
    public void addStore(Store store);

    /**
     *
     * @param store
     */
    public void editStore(Store store);

    /**
     *
     * @param storeId
     */
    public void deleteStore(String storeId);

    /**
     *
     * @param storeId
     * @return
     */
    public Store queryStoreById(String storeId);

    /**
     *
     * @param storeName
     * @param pno
     * @param psize
     * @return
     */
    public Pager<Store> queryStores(String storeName, int pno, int psize);

    /**
     * 查询附近4S店
     * @param lng
     * @param lat
     * @param distance
     * @param pno
     * @param psize
     * @return
     */
    public Pager<StoreCoordinate> queryStoresByNearby(double lng, double lat, int distance, int pno, int psize);
}
