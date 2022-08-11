package com.ppw.myblog.security;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ppw.myblog.dao.SysUserMapper;
import com.ppw.myblog.entity.SysUser;
import com.ppw.myblog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private SysUserMapper userMapper;

    @Autowired
    private SysUserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //查询数据库判断username是否存在，如果不存在则抛出异常UsernameNotFoundException
        QueryWrapper<SysUser> wrapper = new QueryWrapper<>();
        wrapper.eq("username", username);
        SysUser user = userMapper.selectOne(wrapper);
        if (user == null) {
            throw new UsernameNotFoundException("用户名或密码不正确!");
        }
        //从数据库查出的用户信息id,username,password,authorityList

        List<GrantedAuthority> authorityList = getUserAuthority(user.getId());
        return new MyUserDetails(user.getId(), user.getUsername(), user.getPassword(), authorityList);
    }

    public List<GrantedAuthority> getUserAuthority(String id) {
        return AuthorityUtils.commaSeparatedStringToAuthorityList(
                userService.getUserAuthorityInfo(id)
        );
    }
}
