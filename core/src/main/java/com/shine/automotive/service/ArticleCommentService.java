package com.shine.automotive.service;

import com.shine.automotive.base.pager.Pager;
import com.shine.automotive.po.ArticleComment;

import java.util.List;

/**
 * Created by fuzhaohui on 14/11/28.
 */
public interface ArticleCommentService {

    public void addArticleComment(ArticleComment articleComment);
    public void editArticleComment(ArticleComment articleComment);
    public void deleteArticleComment(String articleCommentId);
    public List<ArticleComment> queryArticleCommentByArticle(String articleId);
    public Pager<ArticleComment> queryArticle(String searchParam, int pno, int psize);

}
