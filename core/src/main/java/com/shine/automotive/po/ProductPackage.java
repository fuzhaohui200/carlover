package com.shine.automotive.po;

import java.util.Date;
import java.util.List;

/**
 * Created by boka on 14-12-1.
 * 产品销售套餐
 *
 */
public class ProductPackage {

    private String packageId; //套餐编号
    private String packageName; //　套餐名称
    private List<Product> products; //　销售产品
    private String packageDesc; //　套餐描述
    private double packagePrice; //　套餐价格
    private Date createTime; //　创建时间
    private Date beginTime; //　开始时间
    private Date endTime; // 结束时间

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getPackageDesc() {
        return packageDesc;
    }

    public void setPackageDesc(String packageDesc) {
        this.packageDesc = packageDesc;
    }

    public double getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(double packagePrice) {
        this.packagePrice = packagePrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
