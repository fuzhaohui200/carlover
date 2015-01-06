package com.shine.carlover.po;

import java.util.Date;

/**
 * Created by boka on 14-11-26.
 * 品牌
 */
public class Brand {

    private String brandId;
    private String brandName;  // 品牌名称
    private String productName; // 生产厂商
    private String productCountry; // 生产国家
    private String seriesName; // 所属系列
    private String seriesNum; // 系列编号
    private String brandNum; // 品牌车型编号
    private Date marketTime; // 上市时间

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCountry() {
        return productCountry;
    }

    public void setProductCountry(String productCountry) {
        this.productCountry = productCountry;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getSeriesNum() {
        return seriesNum;
    }

    public void setSeriesNum(String seriesNum) {
        this.seriesNum = seriesNum;
    }

    public String getBrandNum() {
        return brandNum;
    }

    public void setBrandNum(String brandNum) {
        this.brandNum = brandNum;
    }

    public Date getMarketTime() {
        return marketTime;
    }

    public void setMarketTime(Date marketTime) {
        this.marketTime = marketTime;
    }
}
