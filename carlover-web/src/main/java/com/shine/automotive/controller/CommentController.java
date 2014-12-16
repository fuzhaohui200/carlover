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
 * 评论服务接口
 */
@RequestMapping(value = "/comment", produces = { "application/json;charset=UTF-8" })
@RestController
public class CommentController extends BaseController {

    @Resource
    private ServiceBus serviceBus;

    @RequestMapping(value = "addArticleComment", method = RequestMethod.POST)
    @ResponseBody
    public Object addArticleComment(){
        return writeResult("保存成功");
    }

    @RequestMapping(value = "editArticleComment", method = RequestMethod.POST)
    @ResponseBody
    public Object editArticleComment(){
        return writeResult("修改成功");
    }

    @RequestMapping(value = "deleteArticleComment", method = RequestMethod.POST)
    @ResponseBody
    public Object deleteArticleComment() {
        return writeResult("删除成功");
    }
}
