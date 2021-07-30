package com.lagou.service;

import com.lagou.domain.Menu;

import java.util.List;

public interface MenuService {
    /*
    查询所有父子级菜单信息
 */
    public List<Menu> findSubMenuListByPid(int pid);
}
