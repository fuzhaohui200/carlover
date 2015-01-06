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
 * 用户汽车接口服务
 */
@RequestMapping(value = "/car", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
@RestController
public class CarController extends BaseController {

    @Resource
    private ServiceBus serviceBus;

    @RequestMapping(value = "addCar", method = RequestMethod.POST)
    @ResponseBody
    public Object addCar(){
        return writeResult("保存成功");
    }

    @RequestMapping(value = "editCar", method = RequestMethod.POST)
    @ResponseBody
    public Object editCar(){
        return writeResult("修改成功");
    }

    @RequestMapping(value = "deleteCar", method = RequestMethod.POST)
    @ResponseBody
    public Object deleteCar() {
        return writeResult("删除成功");
    }
}
