package cn.com.dbFactory;

import cn.com.dao.DesignDao;
import cn.com.dao.MessageDao;
import cn.com.dao.UserDao;
import cn.com.dao.impl.DesignDaoImpl;
import cn.com.dao.impl.MessageDaoImpl;
import cn.com.dao.impl.UserDaoImpl;

public class DaoFactory {

	public static MessageDao createMessageDAO() {
		return new MessageDaoImpl();
	}

	public static UserDao createUserDAO() {
		return new UserDaoImpl();
	}

	public static DesignDao createDesignDAO(){
		return new DesignDaoImpl();
	}
}
