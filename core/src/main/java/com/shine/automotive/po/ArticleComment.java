package com.shine.automotive.po;

import java.util.Date;

/**
 * Created by boka on 14-11-26.
 * 文章评论评价
 */
public class ArticleComment {

    private Article article; // 文章ID
    private User user; // 用户ID
    private String comment; // 评论内容
    private int start; // 几星
    private int praise; // 点赞
    private Date createTime; // 评论时间

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
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
}
