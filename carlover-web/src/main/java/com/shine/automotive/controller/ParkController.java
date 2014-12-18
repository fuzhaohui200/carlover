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
 * 商场机场停车场服务接品
 */
@RequestMapping(value = "/address", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
@RestController
public class ParkController extends BaseController {

    @Resource
    private ServiceBus serviceBus;

    @RequestMapping(value = "addPark", method = RequestMethod.POST)
    @ResponseBody
    public Object addPark(){
        return writeResult("保存成功");
    }

    @RequestMapping(value = "editPark", method = RequestMethod.POST)
    @ResponseBody
    public Object editPark(){
        return writeResult("修改成功");
    }

    @RequestMapping(value = "deletePark", method = RequestMethod.POST)
    @ResponseBody
    public Object deletePark() {
        return writeResult("删除成功");
    }

}
