package com.shine.automotive.po;

import java.util.Date;

/**
 * Created by boka on 14-11-26.
 * 4S店服务类别
 */
public class ServiceCategory {

    private String serviceCategoryId; // 服务类别ID
    private String parentServiceCategoryId; // 父服务类别
    private String serviceCategoryName; // 服务类别名称
    private String serviceCategoryDesc; // 服务类别描述
    private Date createTime; // 创建时间
    private Date updateTime; // 修改时间

    public String getServiceCategoryId() {
        return serviceCategoryId;
    }

    public void setServiceCategoryId(String serviceCategoryId) {
        this.serviceCategoryId = serviceCategoryId;
    }

    public String getParentServiceCategoryId() {
        return parentServiceCategoryId;
    }

    public void setParentServiceCategoryId(String parentServiceCategoryId) {
        this.parentServiceCategoryId = parentServiceCategoryId;
    }

    public String getServiceCategoryName() {
        return serviceCategoryName;
    }

    public void setServiceCategoryName(String serviceCategoryName) {
        this.serviceCategoryName = serviceCategoryName;
    }

    public String getServiceCategoryDesc() {
        return serviceCategoryDesc;
    }

    public void setServiceCategoryDesc(String serviceCategoryDesc) {
        this.serviceCategoryDesc = serviceCategoryDesc;
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
