package com.ppw.myblog.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ppw.myblog.common.annotation.LogAnnotation;
import com.ppw.myblog.dao.BlogArticleMapper;
import com.ppw.myblog.entity.BlogArticle;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @Autowired
    private BlogArticleMapper blogArticleMapper;

    @PostMapping("/login")
    @ApiOperation(value = "测试自定义注解")
    @LogAnnotation()
    public void login() {
        QueryWrapper<BlogArticle> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNotNull("id" );
        BlogArticle selecttest = blogArticleMapper.selecttest();
        System.out.println(selecttest);
        System.out.println("hello");
    }
}
