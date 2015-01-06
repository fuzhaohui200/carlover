package com.shine.carlover.controller;

import com.shine.carlover.ServiceBus;
import com.shine.carlover.base.controller.BaseController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by boka on 14-11-25.
 * 4S店接口服务
 */
@RequestMapping(value = "/store", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
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
