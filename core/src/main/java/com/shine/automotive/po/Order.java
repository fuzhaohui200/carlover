package com.shine.automotive.po;

import java.util.Date;

/**
 * Created by boka on 14-11-26.
 * 购物订单
 */
public class Order {

    private String orderId; // 编号
    private ShopCart shopCart; // 购物车ID
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ShopCart getShopCart() {
        return shopCart;
    }

    public void setShopCart(ShopCart shopCart) {
        this.shopCart = shopCart;
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
}
