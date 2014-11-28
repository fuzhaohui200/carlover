package com.shine.automotive.po;

/**
 * Created by boka on 14-11-26.
 * 客户基本信息
 */
public class UserInfo {

    private String userInfoId;
    private User user; // 用户ID
    private String realName; // 姓名
    private String signature; // 个人签名
    private String birthday; // 生日
    private String sex; // 性别
    private String nickName; // 昵称
    private String enName; // 英文名称
    private String idCard; // 身份证
    private String address; // 联系地址
    private String country; // 国家
    private String province; // 省
    private String city; // 市
    private String district; // 区、县
    private int level; // 级别
    private int totalPraise; // 总赞赏
    private String userDesc; // 个人说明


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getTotalPraise() {
        return totalPraise;
    }

    public void setTotalPraise(int totalPraise) {
        this.totalPraise = totalPraise;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }
}
