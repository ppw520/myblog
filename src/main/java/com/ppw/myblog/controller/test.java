package com.ppw.myblog.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ppw.myblog.common.annotation.LogAnnotation;
import com.ppw.myblog.dao.BlogArticleMapper;
import com.ppw.myblog.entity.BlogArticle;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class test {

    @Autowired
    private BlogArticleMapper blogArticleMapper;

    @PostMapping("/test")
    @ApiOperation(value = "测试自定义注解")
    @LogAnnotation()
    @PreAuthorize("hasRole('role01')")
    public void login() {
        QueryWrapper<BlogArticle> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNotNull("id" );
        BlogArticle selecttest = blogArticleMapper.selecttest();
        System.out.println(selecttest);
        System.out.println("hello");
    }
}
