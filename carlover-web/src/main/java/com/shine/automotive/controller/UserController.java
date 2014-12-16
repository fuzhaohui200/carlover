package com.shine.automotive.controller;

import com.shine.automotive.ServiceBus;
import com.shine.automotive.base.controller.BaseController;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by boka on 14-11-25.
 * 用户接口服务
 */
@RequestMapping(value = "/user", produces = {"application/json;charset=UTF-8" })
@RestController
public class UserController extends BaseController {

    @Resource
    private ServiceBus serviceBus;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject login(
            @RequestParam(value = "username", required = true)String username,
            @RequestParam(value = "password", required = true)String password) {
        return writeResult("登录成功！");
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject register(){
        return writeResult("注册成功");
    }

    @RequestMapping(value = "findUserById", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject findUserById(
            @RequestParam(value = "userId", required = false)String userId) {
        return writeResult("注册成功");
    }
}
