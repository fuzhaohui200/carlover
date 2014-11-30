package com.shine.automotive.service.impl;

import com.shine.automotive.base.pager.Pager;
import com.shine.automotive.dao.ArticleCommentDao;
import com.shine.automotive.po.ArticleComment;
import com.shine.automotive.service.ArticleCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by fuzhaohui on 14/11/28.
 * 文章评论服务
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS,  readOnly = true)
public class ArticleCommentServiceImpl implements ArticleCommentService {

    @Autowired
    private ArticleCommentDao articleCommentDao;

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void addArticleComment(ArticleComment articleComment) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void editArticleComment(ArticleComment articleComment) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void deleteArticleComment(String articleCommentId) {

    }

    @Transactional(readOnly=true)
    @Override
    public List<ArticleComment> queryArticleCommentByArticle(String articleId) {
        return null;
    }

    @Transactional(readOnly=true)
    @Override
    public Pager<ArticleComment> queryArticle(String searchParam, int pno, int psize) {
        return null;
    }

}
