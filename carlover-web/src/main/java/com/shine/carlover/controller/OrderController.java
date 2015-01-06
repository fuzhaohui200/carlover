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
 * 订单接口服务
 */
@RequestMapping(value = "/order", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
@RestController
public class OrderController extends BaseController {

    @Resource
    private ServiceBus serviceBus;

    @RequestMapping(value = "addOrder", method = RequestMethod.POST)
    @ResponseBody
    public Object addOrder(){
        return writeResult("保存成功");
    }

    @RequestMapping(value = "editOrder", method = RequestMethod.POST)
    @ResponseBody
    public Object editOrder(){
        return writeResult("修改成功");
    }

    @RequestMapping(value = "deleteOrder", method = RequestMethod.POST)
    @ResponseBody
    public Object deleteOrder() {
        return writeResult("删除成功");
    }
}
