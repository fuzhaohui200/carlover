package com.shine.automotive.controller;

import com.shine.automotive.base.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by boka on 14-11-25.
 * 汽车品牌接口服务
 */
@RequestMapping(value = "/brand", produces = { "application/json;charset=UTF-8" })
@RestController
public class BrandController extends BaseController {
}
