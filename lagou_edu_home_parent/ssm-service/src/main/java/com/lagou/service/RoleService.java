package com.lagou.service;

import com.lagou.domain.Role;

import java.security.PublicKey;
import java.util.List;

public interface RoleService {
    /*
        查询所有角色&条件查询
     */
    public List<Role> findAllRole(Role role);
}
