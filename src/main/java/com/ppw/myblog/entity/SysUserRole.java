package com.ppw.myblog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ppw.myblog.common.basic.BscEntityBean;
import lombok.Data;

@Data
@TableName(value = "sys_user_role")
public class SysUserRole extends BscEntityBean {
    private String userId;
    private String roleId;
}
