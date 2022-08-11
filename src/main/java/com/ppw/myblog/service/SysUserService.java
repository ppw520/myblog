package com.ppw.myblog.service;

import com.ppw.myblog.entity.SysUser;

public interface SysUserService {
    String getUserAuthorityInfo(String id);

    SysUser getByUsername(String username);
}
