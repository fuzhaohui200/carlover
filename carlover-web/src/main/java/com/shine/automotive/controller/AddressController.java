package com.shine.automotive.controller;

import com.shine.automotive.base.controller.BaseController;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by boka on 14-11-25.
 * 用户收货地址接口服务
 */
@RequestMapping(value = "/address", produces = { "application/json;charset=UTF-8" })
@RestController
public class AddressController extends BaseController{

    public JSONObject findAddressByUser(@RequestParam(value = "userId", required = true)String userId) {
        return writeResult("查询用户收货地址");
    }

}
