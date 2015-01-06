package com.shine.carlover.po;

import java.util.Date;
import java.util.List;

/**
 * Created by boka on 14-11-26.
 * 购物订单
 */
public class Order {

    private String orderId; // 编号
    private List<ShopCart> shopCarts; // 购物车ID
    private UserInfo userInfo; // 用户名
    private String remark; //　备注
    private String receiver; // 收件人
    private String country; // 国家
    private String province; // 省
    private String city; // 市
    private String district; // 区、县
    private String detailAddress; // 详细地址
    private String postCode; // 邮编
    private Date createTime; //　创建时间
    private Date updateTime; // 更新时间
    private int orderStatus; // 订单状态

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<ShopCart> getShopCarts() {
        return shopCarts;
    }

    public void setShopCarts(List<ShopCart> shopCarts) {
        this.shopCarts = shopCarts;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
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

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }
}
