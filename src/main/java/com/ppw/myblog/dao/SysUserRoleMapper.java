package com.ppw.myblog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ppw.myblog.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface SysUserRoleMapper extends BaseMapper<SysUserRoleMapper> {

    @Select("SELECT b.rolecode,b.rolename from sys_user_role a JOIN sys_role b on  a.role_id = b.id WHERE a.user_id = #{uid};")
    List<SysRole> selectRoles(String uid);
}
