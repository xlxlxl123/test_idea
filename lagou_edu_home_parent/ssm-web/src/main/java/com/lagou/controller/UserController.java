package com.lagou.controller;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.ResponseResult;
import com.lagou.domain.UserVo;
import com.lagou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /*
        用户分页&多条件查询
     */
    @RequestMapping("/findAllUserByPage")
    public ResponseResult findAllUserByPage(@RequestBody UserVo userVo){

        PageInfo pageInfo = userService.findAllUserByPage(userVo);
        return new ResponseResult(true,200,"分页多条件查询成功",pageInfo);
    }


    /*
        修改用户状态
            ENABLE能登录，DISABLE不能登录
     */
    @RequestMapping("/updateUserStatus")
    public ResponseResult updateUserStatus(Integer id,String status){
        if("ENABLE".equalsIgnoreCase(status)){
            status = "DISABLE";
        }else{
            status = "ENABLE";
        }
        userService.updateUserStatus(id, status);
        ResponseResult responseResult = new ResponseResult(true,200,"修改用户状态成功",status);
        return responseResult;
    }

}
