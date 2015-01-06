package com.shine.carlover.service.impl;

import com.shine.carlover.base.pager.Pager;
import com.shine.carlover.dao.ArticleDao;
import com.shine.carlover.po.Article;
import com.shine.carlover.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by fuzhaohui on 14/11/28.
 * 文章服务
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS,  readOnly = true)
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void addArticle(Article article) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void editArticle(Article article) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void deleteArticleById(String articleId) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void deleteArticleByUser(String user) {

    }

    @Transactional(readOnly=false)
    @Override
    public List<Article> queryArticleById(String articleId) {
        return null;
    }

    @Transactional(readOnly=true)
    @Override
    public Pager<Article> queryArticle(String searchParam, String userId, int pno, int psize) {
        return null;
    }

}
