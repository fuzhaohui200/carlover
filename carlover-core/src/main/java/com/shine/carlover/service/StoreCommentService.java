package com.shine.carlover.service;

import com.shine.carlover.base.pager.Pager;
import com.shine.carlover.po.StoreComment;

/**
 * Created by fuzhaohui on 14/11/28.
 * 4S店评论服务
 */
public interface StoreCommentService {

    public void addStoreComment(StoreComment storeComment);
    public void editStoreComment(StoreComment storeComment);
    public void deleteStoreComment(String storeId);
    public Pager<StoreComment> queryStoreCommentByStore(String storeId, int pno, int psize);
}
