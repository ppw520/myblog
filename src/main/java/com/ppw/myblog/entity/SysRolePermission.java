package com.ppw.myblog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ppw.myblog.common.basic.BscEntityBean;

@TableName(value = "sys_role_permission")
public class SysRolePermission extends BscEntityBean {
    private String roleId;
    private String permissionId;
}
