package com.ppw.myblog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ppw.myblog.common.basic.BscEntityBean;
import lombok.Data;

@Data
@TableName(value = "sys_permission")
public class SysPermission extends BscEntityBean {
    private String permissioncode;
    private String permissionname;
}
