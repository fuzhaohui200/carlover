package com.shine.automotive.controller;

import com.shine.automotive.ServiceBus;
import com.shine.automotive.base.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by boka on 14-11-25.
 * 4S店接口服务
 */
@RequestMapping(value = "/store", produces = { "application/json;charset=UTF-8" })
@RestController
public class StoreController extends BaseController {

    @Resource
    private ServiceBus serviceBus;

    @RequestMapping(value = "addStore", method = RequestMethod.POST)
    @ResponseBody
    public Object addStore(){
        return writeResult("保存成功");
    }

    @RequestMapping(value = "editStore", method = RequestMethod.POST)
    @ResponseBody
    public Object editStore(){
        return writeResult("修改成功");
    }

    @RequestMapping(value = "deleteStore", method = RequestMethod.POST)
    @ResponseBody
    public Object deleteStore() {
        return writeResult("删除成功");
    }
}
