package com.shine.automotive.po;

import java.util.Date;

/**
 * Created by boka on 14-11-26.
 * 4S店评论评价
 */
public class StoreComment {

    private Store store; // 店
    private UserInfo userInfo; // 用户
    private String comment; // 评论内容
    private int star; // 几星
    private int praise; // 点赞
    private Date createTime; // 评论时间
    private Date updateTime; // 点赞或取消点赞时间

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public int getPraise() {
        return praise;
    }

    public void setPraise(int praise) {
        this.praise = praise;
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