package com.jcorn.user.serivce.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.WebApplicationException;

import com.jcorn.user.dao.UserDao;
import com.jcorn.user.entity.User;
import com.jcorn.user.serivce.IUserService;

@Named
public class UserService implements IUserService {
	
	@Inject
	private UserDao userDao;

	@Override
	public List<User> getUser(User user) throws WebApplicationException {
		return userDao.queryUser(user);
	}

	@Override
	public User getUserByName(String userName) throws WebApplicationException {
		User u = new User();
		u.setEnabled("Y");
		u.setNameCN("文子哥");
		u.setUserName("wenzige");
		return u;
	}


}
