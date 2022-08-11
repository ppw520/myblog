package com.ppw.myblog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ppw.myblog.dao.SysPermissionMapper;
import com.ppw.myblog.dao.SysUserMapper;
import com.ppw.myblog.dao.SysUserRoleMapper;
import com.ppw.myblog.entity.SysPermission;
import com.ppw.myblog.entity.SysRole;
import com.ppw.myblog.entity.SysUser;
import com.ppw.myblog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Autowired
    private SysUserRoleMapper userRoleMapper;

    @Autowired
    private SysUserMapper userMapper;
    @Autowired
    private SysPermissionMapper permissionMapper;

    //根据用户id获取用户角色
    @Override
    public String getUserAuthorityInfo(String id) {
        List<SysRole> roles = userRoleMapper.selectRoles(id);

        List<String> permissionIds = userMapper.getPermissionIds(id);
        List<SysPermission> permissions = permissionMapper.selectBatchIds(permissionIds);
        String roleNames = roles.stream().map(role -> "ROLE_" + role.getRolecode()).collect(Collectors.joining(","));
        String permNames  = permissions.stream().map(permission -> permission.getPermissioncode()).collect(Collectors.joining(","));

//        ROLE_admin,ROLE_normal,sys:user:list...,
        String authority = roleNames.concat(",").concat(permNames);

        return authority;
    }

    @Override
    public SysUser getByUsername(String username) {
        QueryWrapper<SysUser> wrapper = new QueryWrapper<>();
        wrapper.eq("username", username);
        SysUser user = userMapper.selectOne(wrapper);
        return user;
    }
}
