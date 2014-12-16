package com.shine.automotive.service.impl;

import com.shine.automotive.base.pager.Pager;
import com.shine.automotive.dao.ArticleDao;
import com.shine.automotive.po.Article;
import com.shine.automotive.service.AddressService;
import com.shine.automotive.service.ArticleService;
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
