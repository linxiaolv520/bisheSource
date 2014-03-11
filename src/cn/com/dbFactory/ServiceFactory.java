package cn.com.dbFactory;

import cn.com.service.DesignService;
import cn.com.service.MessageService;
import cn.com.service.UserService;
import cn.com.service.impl.DesignServiceImpl;
import cn.com.service.impl.MessageServiceImpl;
import cn.com.service.impl.UserServiceImpl;

public class ServiceFactory {
	public static MessageService createMessageService() {
		return new MessageServiceImpl();
	}

	public static UserService createUserService() {
		return new UserServiceImpl();
	}
	
	public static DesignService createDesignService(){
		return new DesignServiceImpl();
	}
}
