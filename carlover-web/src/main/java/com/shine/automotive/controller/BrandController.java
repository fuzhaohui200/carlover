package com.shine.automotive.controller;

import com.shine.automotive.ServiceBus;
import com.shine.automotive.base.controller.BaseController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by boka on 14-11-25.
 * 汽车品牌接口服务
 */
@RequestMapping(value = "/brand", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
@RestController
public class BrandController extends BaseController {

    @Resource
    private ServiceBus serviceBus;

    @RequestMapping(value = "addBrand", method = RequestMethod.POST)
    @ResponseBody
    public Object addBrand(){
        return writeResult("保存成功");
    }

    @RequestMapping(value = "editBrand", method = RequestMethod.POST)
    @ResponseBody
    public Object editBrand(){
        return writeResult("修改成功");
    }

    @RequestMapping(value = "deleteBrand", method = RequestMethod.POST)
    @ResponseBody
    public Object deleteBrand() {
        return writeResult("删除成功");
    }
}
