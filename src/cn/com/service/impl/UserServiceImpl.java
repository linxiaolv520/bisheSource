package cn.com.service.impl;

import cn.com.dao.UserDao;
import cn.com.dbFactory.DaoFactory;
import cn.com.domain.User;
import cn.com.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao = DaoFactory.createUserDAO();

	@Override
	public User getAdminMessage(int status) {
		// TODO Auto-generated method stub
		return userDao.getAdminMessage(status);
	}

	@Override
	public User isLoign(String userName, String password) {
		// TODO Auto-generated method stub
		return userDao.isLogin(userName,password);
	}

}
