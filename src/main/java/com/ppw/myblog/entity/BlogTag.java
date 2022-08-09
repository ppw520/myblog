package com.ppw.myblog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ppw.myblog.common.basic.BscEntityBean;
import lombok.Data;

@Data
@TableName(value = "blog_tag")
public class BlogTag extends BscEntityBean {

    private String avatar;
    private String tagname;

}
