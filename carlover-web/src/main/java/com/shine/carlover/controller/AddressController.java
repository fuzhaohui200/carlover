package com.shine.carlover.controller;

import com.shine.carlover.ServiceBus;
import com.shine.carlover.base.controller.BaseController;
import net.sf.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by boka on 14-11-25.
 * 用户收货地址接口服务
 */
@RequestMapping(value = "/address", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
@RestController
public class AddressController extends BaseController{

    @Resource
    private ServiceBus serviceBus;

    public JSONObject findAddressByUser(@RequestParam(value = "userId", required = true)String userId) {
        return writeResult("查询用户收货地址");
    }

    @RequestMapping(value = "addAddress", method = RequestMethod.POST)
    @ResponseBody
    public Object addAddress(){
        return writeResult("保存成功");
    }

    @RequestMapping(value = "editAddress", method = RequestMethod.POST)
    @ResponseBody
    public Object editAddress(){
        return writeResult("修改成功");
    }

    @RequestMapping(value = "deleteAddress", method = RequestMethod.POST)
    @ResponseBody
    public Object deleteAddress() {
        return writeResult("删除成功");
    }

}
