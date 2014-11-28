package com.shine.automotive.po;

import java.util.Date;

/**
 * Created by boka on 14-11-26.
 * 车辆保养记录
 */
public class CarRecord {

    private Car car; // 车辆ID
    private String serviceId; // 服务ID
    private String content; //描述
    private Date createTime; // 服务时间

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
