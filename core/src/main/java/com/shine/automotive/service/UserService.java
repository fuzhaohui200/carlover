package com.shine.automotive.service;

import com.shine.automotive.po.UserInfo;

import java.util.List;

/**
 * Created by fuzhaohui on 14/11/28.
 */
public interface UserService {

    public void addUserInfo(UserInfo user);
    public void editUserInfo(UserInfo user);
    public void deleteUserInfo(String userId);
    public UserInfo queryUserInfo(String username, String password);
    public List<UserInfo> queryUsers(String params);


}
