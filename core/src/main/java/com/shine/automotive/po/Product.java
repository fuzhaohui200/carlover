package com.shine.automotive.po;

import java.util.Date;

/**
 * Created by boka on 14-11-26.
 * 销售产品
 */
public class Product {

    private String productId; // 产品ID
    private String categoryId; // 分类ID
    private String storeId; // 店ID
    private String productName; // 产品名称
    private String productDesc; // 产品描述
    private double productPrice; // 产品价格
    private double discount; // 产品折扣
    private double discountPrice; // 折扣价格
    private int isAdded; // 是否上架
    private Date createTime; // 创建时间
    private Date updateTime; // 修改时间

}
