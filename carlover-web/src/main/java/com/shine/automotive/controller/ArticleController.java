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
 * 文章博客服务接口
 */
@RequestMapping(value = "/Article", produces = { "application/json;charset=UTF-8" })
@RestController
public class ArticleController extends BaseController {

    @Resource
    private ServiceBus serviceBus;

    @RequestMapping(value = "addArticle", method = RequestMethod.POST)
    @ResponseBody
    public Object addArticle(){
        return writeResult("保存成功");
    }

    @RequestMapping(value = "editArticle", method = RequestMethod.POST)
    @ResponseBody
    public Object editArticle(){
        return writeResult("修改成功");
    }

    @RequestMapping(value = "deleteArticle", method = RequestMethod.POST)
    @ResponseBody
    public Object deleteArticle() {
        return writeResult("删除成功");
    }
}
