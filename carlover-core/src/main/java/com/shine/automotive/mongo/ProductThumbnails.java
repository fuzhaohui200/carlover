package com.shine.automotive.mongo;

import java.util.Date;

/**
 * Created by boka on 14-11-26.
 * 产品缩略图
 *
 */
public class ProductThumbnails {

    private String thumbnailsId; // 缩略图ID
    private String productId; // 产品ID
    private String thumbnailsUrl; // 缩略图URL
    private Date createTime; // 创建时间
    private Date updateTime; // 修改时间

    public String getThumbnailsId() {
        return thumbnailsId;
    }

    public void setThumbnailsId(String thumbnailsId) {
        this.thumbnailsId = thumbnailsId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getThumbnailsUrl() {
        return thumbnailsUrl;
    }

    public void setThumbnailsUrl(String thumbnailsUrl) {
        this.thumbnailsUrl = thumbnailsUrl;
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
