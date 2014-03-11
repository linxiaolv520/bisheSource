package cn.com.servlet;

import cn.com.dbFactory.ServiceFactory;
import cn.com.domain.User;
import cn.com.service.UserService;
import cn.com.tomcat.servlet.HttpServletRequest;
import cn.com.tomcat.servlet.HttpServletResponse;
import cn.com.tomcat.servlet.Servlet;
import cn.com.until.MemcachedUtil;

public class AdminLogin implements Servlet {
	UserService userService = ServiceFactory.createUserService();

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		if (request.getParameter("loginName") != null
				&& request.getParameter("password") != null) {
			String loginName = (String) request.getParameter("loginName");
			String password = (String) request.getParameter("password");
			if (loginName != null && password != null) {
				User user = userService.isLoign(loginName, password);
				if (user != null) {
					MemcachedUtil.put("user", user);
					request.dispatch("/homedesign/operateSuccess.html", response);			
				} else {
					request.dispatch("/homedesign/operateFail.html", response);
				}
			}
		} else {
			request.dispatch("/homedesign/operateFail.html", response);
		}

		
	}

}
