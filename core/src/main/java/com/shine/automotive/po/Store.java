package com.shine.automotive.po;

/**
 * Created by boka on 14-11-26.
 * 门店
 */
public class Store {

    private String storeId;
    private User user;
    private String parentStoreId; // 总店或总部ID
    private String storeName; // 4S店名称
    private String phone; // 店联系电话
    private String phone2; // 备用联系电话
    private String contact; // 联系人
    private String storeCert; // 4S店营业执照
    private String alipay; // 支付宝帐号
    private String tenpay; // 财付通
    private int isOfflineStore; // 是否为实体店
    private String country; // 国家
    private String province; // 省
    private String city; // 市
    private String district; // 区、县
    private String detailAddress; // 4S店详细地址
    private int isTraffic; // 是否营业


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

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
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

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public int getIsTraffic() {
        return isTraffic;
    }

    public void setIsTraffic(int isTraffic) {
        this.isTraffic = isTraffic;
    }
}
