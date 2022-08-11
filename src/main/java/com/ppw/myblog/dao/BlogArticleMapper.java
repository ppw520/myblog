package com.ppw.myblog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ppw.myblog.entity.BlogArticle;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogArticleMapper extends BaseMapper<BlogArticle> {

    BlogArticle selecttest();
}
