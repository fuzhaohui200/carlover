package com.shine.carlover.service;

import com.shine.carlover.base.pager.Pager;
import com.shine.carlover.mongo.UserCoordinate;
import com.shine.carlover.po.UserInfo;

/**
 * Created by fuzhaohui on 14/11/28.
 * 用户管理
 */
public interface UserService {

    /**
     *
     * @param user
     */
    public void addUserInfo(UserInfo user);

    /**
     *
     * @param user
     */
    public void editUserInfo(UserInfo user);

    /**
     *
     * @param userId
     */
    public void deleteUserInfo(String userId);

    /**
     *
     * @param username
     * @param password
     * @return
     */
    public UserInfo queryUserInfo(String username, String password);

    /**
     * 搜索用户
     * @param searchParams
     * @param pno
     * @param psize
     * @return
     */
    public Pager<UserInfo> queryUsers(String searchParams, int pno, int psize);

    /**
     * 获取附近用户
     * @param lng
     * @param lat
     * @param distance
     * @param pno
     * @param psize
     * @return
     */
    public Pager<UserCoordinate> queryUsersByNearby(double lng, double lat, int distance, int pno, int psize);


}
