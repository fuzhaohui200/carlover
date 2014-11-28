package com.shine.automotive.po;

/**
 * Created by boka on 14-11-26.
 * 客户基本信息
 */
public class UserInfo {

    private User user; // 用户ID
    private String realName; // 姓名
    private String cardNum; // 身份证
    private double userLng; // 纬度
    private double userLat; // 经度
    private String address; // 联系地址

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public double getUserLng() {
        return userLng;
    }

    public void setUserLng(double userLng) {
        this.userLng = userLng;
    }

    public double getUserLat() {
        return userLat;
    }

    public void setUserLat(double userLat) {
        this.userLat = userLat;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
