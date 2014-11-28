package com.shine.automotive.po;

/**
 * Created by boka on 14-11-26.
 * 门店
 */
public class Store {

    private String storeId;
    private User user;
    private String headStoreId; // 总店或总部ID
    private String storeName; // 4S店名称
    private String storeAddress; // 4S店详细地址
    private String storePhone; // 店联系电话
    private String storePhone2; // 备用联系电话
    private String storeContact; // 联系人
    private String storeCert; // 4S店营业执照
    private String alipay; // 支付宝帐号
    private String tenpay; // 财付通
    private int isOfflineStore; // 是否为实体店
    private String country; // 国家
    private String province; // 省
    private String city; // 市
    private String district; // 区、县

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getHeadStoreId() {
        return headStoreId;
    }

    public void setHeadStoreId(String headStoreId) {
        this.headStoreId = headStoreId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }

    public String getStorePhone2() {
        return storePhone2;
    }

    public void setStorePhone2(String storePhone2) {
        this.storePhone2 = storePhone2;
    }

    public String getStoreContact() {
        return storeContact;
    }

    public void setStoreContact(String storeContact) {
        this.storeContact = storeContact;
    }

    public String getStoreCert() {
        return storeCert;
    }

    public void setStoreCert(String storeCert) {
        this.storeCert = storeCert;
    }

    public String getAlipay() {
        return alipay;
    }

    public void setAlipay(String alipay) {
        this.alipay = alipay;
    }

    public String getTenpay() {
        return tenpay;
    }

    public void setTenpay(String tenpay) {
        this.tenpay = tenpay;
    }

    public int getIsOfflineStore() {
        return isOfflineStore;
    }

    public void setIsOfflineStore(int isOfflineStore) {
        this.isOfflineStore = isOfflineStore;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
