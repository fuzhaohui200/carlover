package com.shine.automotive.mongo;

import java.util.List;

/**
 * Created by fuzhaohui on 14-11-29.
 */
public class StoreCoordinate {

    private String storeId; // 店ID
    private String storeName; // 店名
    private String storeDesc; // 店描述
    private double storeLng; // 经度
    private double storeLat; // 纬度
    private String avater; // 头像
    private double distance; // 距离
    private List<String> thumbnails; // 缩略图

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreDesc() {
        return storeDesc;
    }

    public void setStoreDesc(String storeDesc) {
        this.storeDesc = storeDesc;
    }

    public double getStoreLng() {
        return storeLng;
    }

    public void setStoreLng(double storeLng) {
        this.storeLng = storeLng;
    }

    public double getStoreLat() {
        return storeLat;
    }

    public void setStoreLat(double storeLat) {
        this.storeLat = storeLat;
    }

    public String getAvater() {
        return avater;
    }

    public void setAvater(String avater) {
        this.avater = avater;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public List<String> getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(List<String> thumbnails) {
        this.thumbnails = thumbnails;
    }
}
