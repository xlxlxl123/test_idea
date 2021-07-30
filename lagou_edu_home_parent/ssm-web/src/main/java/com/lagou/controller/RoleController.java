package com.lagou.controller;

import com.lagou.domain.Menu;
import com.lagou.domain.ResponseResult;
import com.lagou.domain.Role;
import com.lagou.service.MenuService;
import com.lagou.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    /*
        查询所有角色&条件查询
     */
    @RequestMapping("/findAllRole")
    public ResponseResult findAllRole(@RequestBody Role role){
        List<Role> allRole = roleService.findAllRole(role);
        return new ResponseResult(true,200,"查询角色成功",allRole);
    }

    /*
        查询所有父子菜单信息（分配菜单的第一个接口）
     */
    @Autowired
    private MenuService menuService;

    @RequestMapping("/findAllMenu")
    public ResponseResult findSubMenuListByPid(){

        //-1代表插叙所有的父子级菜单
        List<Menu> menuList = menuService.findSubMenuListByPid(-1);

        //响应数据
        Map<String,Object> map = new HashMap<>();
        map.put("parentMenuList",menuList);

        ResponseResult responseResult = new ResponseResult(true, 200, "查询所有的父子菜单信息成功", map);
        return responseResult;
    }
}
