package com.shine.carlover.service;

import com.shine.carlover.base.pager.Pager;
import com.shine.carlover.po.Article;

import java.util.List;

/**
 * Created by fuzhaohui on 14/11/28.
 * 文章服务
 */
public interface ArticleService {

    public void addArticle(Article article);
    public void editArticle(Article article);
    public void deleteArticleById(String articleId);
    public void deleteArticleByUser(String user);
    public List<Article> queryArticleById(String articleId);
    public Pager<Article> queryArticle(String searchParam, String userId, int pno, int psize);

}
