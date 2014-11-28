package com.shine.automotive.service;

import com.shine.automotive.po.Store;
import com.shine.automotive.po.StoreComment;

import java.util.List;

/**
 * Created by fuzhaohui on 14/11/28.
 */
public interface StoreCommentService {

    public void addStoreComment(StoreComment storeComment);
    public void editStoreComment(StoreComment storeComment);
    public void deleteStoreComment(String storeId);
    public List<StoreComment> queryStoreCommentByStore(String storeId);
}
