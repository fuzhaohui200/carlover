package com.shine.automotive.po;

import java.util.Date;

/**
 * Created by boka on 14-11-26.
 * 保养文章
 */
public class Article {

    private String articleId;
    private String userId; // 作者用户ID
    private String title; // 标题
    private String content; // 内容
    private String mark; // 标签
    private Date createTime; // 创作时间
    private Date updateTime; // 修改时间

}
