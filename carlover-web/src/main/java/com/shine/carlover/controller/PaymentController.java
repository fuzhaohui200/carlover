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
 * 支付接口服务
 */
@RequestMapping(value = "/payment", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
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
