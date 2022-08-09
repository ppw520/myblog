package com.ppw.myblog.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.ppw.myblog.common.basic.BscEntityBean;
import lombok.Data;

@Data
@TableName(value = "blog_article")
public class BlogArticle extends BscEntityBean {
    private String summary;
    private String title;
    private String bodyId;
    private String categoryId;
    private String authId;
}
