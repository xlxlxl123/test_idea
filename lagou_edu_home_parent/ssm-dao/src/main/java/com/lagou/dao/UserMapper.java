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
    
    public void updateUserStatus55(User user);
    public void updateUserStatus54(User user);
    public void updateUserStatus32(User user);
    public void updateUserStatus23(User user);
    public void updateUserStatus24(User user);
    public void updateUserStatus52(User user);
}
