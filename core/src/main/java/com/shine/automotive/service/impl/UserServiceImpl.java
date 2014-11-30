package com.shine.automotive.service.impl;

import com.shine.automotive.base.pager.Pager;
import com.shine.automotive.dao.UserDao;
import com.shine.automotive.mongo.UserCoordinate;
import com.shine.automotive.po.User;
import com.shine.automotive.po.UserInfo;
import com.shine.automotive.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by fuzhaohui on 14/11/28.
 * 用户管理
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS,  readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void addUserInfo(UserInfo userInfo) {
        User user = userInfo.getUser();
        userDao.save("saveUser", user);
        userDao.save("saveUserInfo", userInfo);
    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void editUserInfo(UserInfo userInfo) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void deleteUserInfo(String userId) {

    }

    @Transactional(readOnly=true)
    @Override
    public UserInfo queryUserInfo(String username, String password) {
        return null;
    }

    @Transactional(readOnly=true)
    @Override
    public Pager<UserInfo> queryUsers(String searchParams, int pno, int psize) {
        return null;
    }

    @Transactional(readOnly=true)
    @Override
    public Pager<UserCoordinate> queryUsersByNearby(double lng, double lat, int distance, int pno, int psize) {
        return null;
    }


}
