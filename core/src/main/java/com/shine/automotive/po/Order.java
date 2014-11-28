package com.shine.automotive.po;

import java.util.Date;

/**
 * Created by boka on 14-11-26.
 * 购物订单
 */
public class Order {

    private String orderId; // 编号
    private ShopCart shopCart; // 购物车ID
    private String userId; // 用户名
    private String remark; //　备注
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
