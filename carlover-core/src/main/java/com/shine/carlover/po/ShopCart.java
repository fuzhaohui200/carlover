package com.shine.carlover.po;

import java.util.Date;

/**
 * Created by boka on 14-11-26.
 * 购物车『这里存储产品信息是为了防止产品下架或信息更改而改变订单的信息』
 */
public class ShopCart {

    private String userId; // 用户ID
    private String productId; // 产品ID
    private String productName; // 产品名称
    private String productDesc; // 产品描述
    private double productPrice; // 购买产品价格
    private double realProductPrice; // 实际购买产品价格
    private int count; // 购买数量
    private Date createTime; // 创建时间
    private Date updateTime; // 修改时间

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getRealProductPrice() {
        return realProductPrice;
    }

    public void setRealProductPrice(double realProductPrice) {
        this.realProductPrice = realProductPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
