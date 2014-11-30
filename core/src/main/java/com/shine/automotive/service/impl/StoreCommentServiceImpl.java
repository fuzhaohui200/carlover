package com.shine.automotive.service.impl;

import com.shine.automotive.base.pager.Pager;
import com.shine.automotive.dao.StoreCommentDao;
import com.shine.automotive.po.StoreComment;
import com.shine.automotive.service.StoreCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by fuzhaohui on 14/11/28.
 * 4S店评论服务
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS,  readOnly = true)
public class StoreCommentServiceImpl implements StoreCommentService {

    @Autowired
    private StoreCommentDao storeCommentDao;

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void addStoreComment(StoreComment storeComment) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void editStoreComment(StoreComment storeComment) {

    }

    @Transactional(readOnly=true)
    @Override
    public void deleteStoreComment(String storeId) {

    }

    @Transactional(readOnly=true)
    @Override
    public Pager<StoreComment> queryStoreCommentByStore(String storeId, int pno, int psize) {
        return null;
    }
}
