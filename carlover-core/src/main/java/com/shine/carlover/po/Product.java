package com.shine.carlover.po;

import com.shine.carlover.mongo.ProductThumbnails;

import java.util.Date;
import java.util.List;

/**
 * Created by boka on 14-11-26.
 * 销售产品
 */
public class Product {

    private String productId; // 产品ID
    private ProductCategory productCategory; // 分类ID
    private Store store; // 店ID
    private String productName; // 产品名称
    private String productDesc; // 产品描述
    private double productPrice; // 产品价格
    private double discount; // 产品折扣
    private double discountPrice; // 折扣价格
    private int isAdded; // 是否上架
    private Date createTime; // 创建时间
    private Date updateTime; // 修改时间
    private long totalSale; // 总销量
    private long totalReserve; // 库存
    private int productLevel; // 显示级别

    private List<ProductThumbnails> productThumbnailsList;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public int getIsAdded() {
        return isAdded;
    }

    public void setIsAdded(int isAdded) {
        this.isAdded = isAdded;
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

    public List<ProductThumbnails> getProductThumbnailsList() {
        return productThumbnailsList;
    }

    public void setProductThumbnailsList(List<ProductThumbnails> productThumbnailsList) {
        this.productThumbnailsList = productThumbnailsList;
    }

    public long getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(long totalSale) {
        this.totalSale = totalSale;
    }

    public long getTotalReserve() {
        return totalReserve;
    }

    public void setTotalReserve(long totalReserve) {
        this.totalReserve = totalReserve;
    }

    public int getProductLevel() {
        return productLevel;
    }

    public void setProductLevel(int productLevel) {
        this.productLevel = productLevel;
    }
}
