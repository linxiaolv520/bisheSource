package cn.com.dao.impl;

import java.sql.ResultSet;

import cn.com.dao.UserDao;
import cn.com.dbFactory.DBFactory;
import cn.com.domain.User;

public class UserDaoImpl implements UserDao {

	private DBFactory dbc = new DBFactory();

	@Override
	public User getAdminMessage(int status) {
		// TODO Auto-generated method stub
		String sql = "select * from user where status=?";
		Object[] obj = { status };
		User user = new User();
		try {
			ResultSet res = dbc.execSqlWithResultset(sql, obj);			
			if (res.next()) {
				user.setUserId(res.getInt("user_id"));
				user.setPhone(res.getString("phone"));
				user.setAddress(res.getString("address"));
				user.setEmail(res.getString("email"));
				user.setName(res.getString("name"));
				user.setQq(res.getString("qq"));
				user.setRemark(res.getString("remark"));
				user.setState(res.getInt("state"));
				user.setStatus(res.getInt("status"));
				user.setPassword(res.getString("password"));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User  isLogin(String userName, String password) {
		// TODO Auto-generated method stub
		String sql = "select * from user where name =? and password = ?";
		
		Object[] obj = {userName,password};
		User user =null;
		try {
			ResultSet res = dbc.execSqlWithResultset(sql, obj);			
			if (res.next()) {
				 user = new User();
				user.setUserId(res.getInt("user_id"));
				user.setPhone(res.getString("phone"));
				user.setAddress(res.getString("address"));
				user.setEmail(res.getString("email"));
				user.setName(res.getString("name"));
				user.setQq(res.getString("qq"));
				user.setRemark(res.getString("remark"));
				user.setState(res.getInt("state"));
				user.setStatus(res.getInt("status"));
				user.setPassword(res.getString("password"));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

}
