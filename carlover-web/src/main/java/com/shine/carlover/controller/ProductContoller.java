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
 * 产品接口服务
 */
@RequestMapping(value = "/product", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
@RestController
public class ProductContoller extends BaseController {

    @Resource
    private ServiceBus serviceBus;

    @RequestMapping(value = "addProduct", method = RequestMethod.POST)
    @ResponseBody
    public Object addProduct(){
        return writeResult("保存成功");
    }

    @RequestMapping(value = "editProduct", method = RequestMethod.POST)
    @ResponseBody
    public Object editProduct(){
        return writeResult("修改成功");
    }

    @RequestMapping(value = "deleteProduct", method = RequestMethod.POST)
    @ResponseBody
    public Object deleteProduct() {
        return writeResult("删除成功");
    }
}
