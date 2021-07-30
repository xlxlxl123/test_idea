package com.lagou.dao;

import com.lagou.domain.User;
import com.lagou.domain.UserVo;

import java.util.List;

public interface UserMapper {

    /*
        用户分页&多条件组合查询
     */
    public List<User> findAllUserByPage(UserVo userVo);

    /*
        修改用户状态
     */
    public void updateUserStatus(User user);

    public void updateUserStatus2(User user);

    public void test1();
    public void test3();
    public void test4();
    public void test5();
    public void test6();
    public void test7();
    public void test8();
    public void test9();

}
