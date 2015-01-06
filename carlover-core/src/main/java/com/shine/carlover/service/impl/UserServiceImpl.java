package com.shine.carlover.service.impl;

import com.shine.carlover.base.pager.Pager;
import com.shine.carlover.dao.UserDao;
import com.shine.carlover.mongo.UserCoordinate;
import com.shine.carlover.po.User;
import com.shine.carlover.po.UserInfo;
import com.shine.carlover.service.UserService;
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
