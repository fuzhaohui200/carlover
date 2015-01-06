package com.shine.carlover.po;

import java.util.Date;

/**
 * Created by boka on 14-11-26.
 * 车辆信息
 */
public class Car {

    private String carId; // 车辆编号
    private Brand brand; // 品牌ID
    private UserInfo userInfo; // 车主信息ID
    private Date buyTime; // 购买时间
    private String carNum; // 车牌号
    private Date createTime; // 登记时间
    private Date updateTime; // 修改时间

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
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
