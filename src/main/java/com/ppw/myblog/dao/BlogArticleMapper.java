package com.ppw.myblog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ppw.myblog.entity.BlogArticle;


public interface BlogArticleMapper extends BaseMapper<BlogArticle> {

    BlogArticle selecttest();
}
