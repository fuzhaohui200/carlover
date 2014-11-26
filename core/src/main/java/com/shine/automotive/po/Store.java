package com.shine.automotive.po;

/**
 * Created by boka on 14-11-26.
 * 门店
 */
public class Store {

    private String storeId;
    private String headStoreId; // 总店或总部ID
    private String storeName; // 4S店名称
    private String storeAddress; // 4S店详细地址
    private double storeLng; // 经度
    private double storeLat; // 纬度
    private String storePhone; // 店联系电话
    private String storePhone2; // 备用联系电话
    private String storeContact; // 联系人
    private String storeCert; // 4S店营业执照
    private String alipay; // 支付宝帐号
    private String tenpay; // 财付通
    private int isOfflineStore; // 是否为实体店

}
