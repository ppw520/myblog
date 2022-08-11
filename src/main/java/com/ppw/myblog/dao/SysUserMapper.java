package com.ppw.myblog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ppw.myblog.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    @Select("SELECT rm.permission_id FROM sys_user_role ur RIGHT JOIN sys_role_permission rm ON ur.role_id = rm.role_id WHERE ur.user_id = #{uid};")
    List<String> getPermissionIds(String uid);
}
