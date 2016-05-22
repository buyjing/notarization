package com.jcorn.user.dao;

import java.util.List;

import com.jcorn.user.entity.User;

public interface UserDao {
	 /**
     * 查询用户信息
     * @param user
     * @return
     */
    public List<User> queryUser(User user);
}
