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
 * 支付接口服务
 */
@RequestMapping(value = "/payment", produces = { "application/json;charset=UTF-8" })
@RestController
public class PaymentController extends BaseController {

    @Resource
    private ServiceBus serviceBus;

    @RequestMapping(value = "alipay", method = RequestMethod.POST)
    @ResponseBody
    public Object alipay() {
        return writeResult("支付成功");
    }

    @RequestMapping(value = "tenpay", method = RequestMethod.POST)
    @ResponseBody
    public Object tenpay() {
        return writeResult("支付成功");
    }

    @RequestMapping(value = "scorepay", method = RequestMethod.POST)
    @ResponseBody
    public Object scorepay() {
        return writeResult("支付成功");
    }
}
