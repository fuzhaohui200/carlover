package com.shine.automotive.po;

import java.util.Date;
import java.util.List;

/**
 * Created by boka on 14-12-1.
 * 保养服务套餐
 *
 */
public class ServicePackage {

    private String packageId; // 套餐ID
    private String packageName; // 套餐名称
    private List<Service> services; //　保养服务
    private String packageDesc; //　套餐描述
    private Double packagePrice; //　套餐价格
    private Date createTime; //　创建时间
    private Date beginTime; // 开始时间
    private Date endTime; //　结束时间

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

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public String getPackageDesc() {
        return packageDesc;
    }

    public void setPackageDesc(String packageDesc) {
        this.packageDesc = packageDesc;
    }

    public Double getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(Double packagePrice) {
        this.packagePrice = packagePrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
