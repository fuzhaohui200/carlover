package com.shine.automotive.controller;

import com.shine.automotive.base.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by boka on 14-11-25.
 * 4S店接口服务
 */
@RequestMapping(value = "/store", produces = { "application/json;charset=UTF-8" })
@RestController
public class StoreController extends BaseController {
}
