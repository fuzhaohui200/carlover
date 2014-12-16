package com.shine.automotive.controller;

import com.shine.automotive.ServiceBus;
import com.shine.automotive.base.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by boka on 14-11-25.
 * 积分服务接口
 */
@RequestMapping(value = "/address", produces = { "application/json;charset=UTF-8" })
@RestController
public class ScoreController extends BaseController {

    @Resource
    private ServiceBus serviceBus;

}
