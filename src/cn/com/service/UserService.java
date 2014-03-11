package cn.com.service;

import cn.com.domain.User;

public interface UserService {
	public User getAdminMessage(int status);
	public User isLoign(String userName,String password);
}
