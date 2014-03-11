package cn.com.dao;

import cn.com.domain.User;

public interface UserDao {

	public User getAdminMessage(int status);

	public User isLogin(String userName, String password);
}
