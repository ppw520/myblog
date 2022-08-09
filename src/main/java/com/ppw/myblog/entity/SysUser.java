package com.ppw.myblog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ppw.myblog.common.basic.BscEntityBean;
import lombok.Data;

@Data
@TableName(value = "sys_user")
public class SysUser extends BscEntityBean {

    private String username;
    private String password;
    private String passwordMd5;

}
