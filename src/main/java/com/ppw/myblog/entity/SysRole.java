package com.ppw.myblog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ppw.myblog.common.basic.BscEntityBean;
import lombok.Data;

@Data
@TableName(value = "sys_role")
public class SysRole extends BscEntityBean {

    private String rolename;
}
