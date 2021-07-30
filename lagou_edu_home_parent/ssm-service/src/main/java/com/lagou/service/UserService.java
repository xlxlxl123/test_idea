package com.lagou.service;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.User;
import com.lagou.domain.UserVo;

public interface UserService {

    /*
        用户分页&多条件查询
     */
    public PageInfo findAllUserByPage(UserVo userVo);

    /*
         修改用户状态
     */
    public void updateUserStatus(Integer id,String status);
}
