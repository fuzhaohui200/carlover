package com.shine.carlover.po;

/**
 * Created by boka on 14-11-26.
 * 门店
 */
public class Store {

    private String storeId;
    private User user;
    private String parentStoreId; // 总店或总部ID
    private String storeName; // 4S店名称
    private String phone; // 店备用联系电话
    private String contact; // 联系人
    private String storeCert; // 4S店营业执照
    private String alipay; // 支付宝帐号
    private String tenpay; // 财付通
    private int isOfflineStore; // 是否为实体店
    private Address address; // 店地址信息
    private int isTraffic; // 是否营业
    private int storeLevel; // 显示级别


    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getParentStoreId() {
        return parentStoreId;
    }

    public void setParentStoreId(String parentStoreId) {
        this.parentStoreId = parentStoreId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getIsTraffic() {
        return isTraffic;
    }

    public void setIsTraffic(int isTraffic) {
        this.isTraffic = isTraffic;
    }

    public int getStoreLevel() {
        return storeLevel;
    }

    public void setStoreLevel(int storeLevel) {
        this.storeLevel = storeLevel;
    }
}
