package cn.com.servlet;

import java.io.PrintWriter;
import cn.com.dbFactory.ServiceFactory;
import cn.com.domain.User;
import cn.com.service.UserService;
import cn.com.tomcat.servlet.HttpServletRequest;
import cn.com.tomcat.servlet.HttpServletResponse;
import cn.com.tomcat.servlet.Servlet;

public class Contact implements Servlet {

	UserService userService = ServiceFactory.createUserService();

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		if (request.getParameter("tip") != null) {

			String tip = (String) request.getParameter("tip");
			String result = "";
			if (tip.equals("contact")) {
				User user = userService.getAdminMessage(User.ADMIN);
				result = "{telephone:'" + user.getPhone() + "',email:'"
						+ user.getEmail() + "',address:'"+user.getAddress()+"',qq:'"+user.getQq()+"'}";
		
			}
			PrintWriter out = response.getOutWriter();
			out.print(result);
			out.flush();
		} 

	}

}
