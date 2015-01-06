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
 * 4S店服务接口服务
 */
@RequestMapping(value = "/service", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
@RestController
public class ServiceController extends BaseController {

    @Resource
    private ServiceBus serviceBus;

    @RequestMapping(value = "addService", method = RequestMethod.POST)
    @ResponseBody
    public Object addService(){
        return writeResult("保存成功");
    }

    @RequestMapping(value = "editService", method = RequestMethod.POST)
    @ResponseBody
    public Object editService(){
        return writeResult("修改成功");
    }

    @RequestMapping(value = "deleteService", method = RequestMethod.POST)
    @ResponseBody
    public Object deleteService() {
        return writeResult("删除成功");
    }
}
