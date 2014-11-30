package com.shine.automotive.controller;

import com.shine.automotive.base.controller.BaseController;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by boka on 14-11-25.
 * 用户接口服务
 */
@RequestMapping(value = "/user", produces = { "application/json;charset=UTF-8" })
@RestController
public class UserController extends BaseController {

    public JSONObject login(String username, String password) {
        return writeResult("登录成功！");
    }
}
