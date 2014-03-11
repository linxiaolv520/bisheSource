package cn.com.servlet;

import cn.com.dbFactory.ServiceFactory;
import cn.com.domain.Message;
import cn.com.service.MessageService;
import cn.com.tomcat.servlet.HttpServletRequest;
import cn.com.tomcat.servlet.HttpServletResponse;
import cn.com.tomcat.servlet.Servlet;

public class SendMessage implements Servlet {

	MessageService messageService = ServiceFactory.createMessageService();

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String top = (String) request.getParameter("top");
		String userName = (String) request.getParameter("username");
		String content = (String) request.getParameter("content");
		String phone = (String) request.getParameter("phone");
		String email = (String) request.getParameter("email");
		String qq = (String) request.getParameter("qq");
		//System.out.println("content" + content);
		try {
			top = new String(top.getBytes(), "utf-8");
			userName = new String(userName.getBytes(), "utf-8");
			content = new String(content.getBytes(), "utf-8");
			phone = new String(phone.getBytes(), "utf-8");
			email = new String(email.getBytes(), "utf-8");
			qq = new String(qq.getBytes(), "utf-8");
		//	System.out.println("content" + content);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (Message.isEmpty(top) && Message.isEmpty(userName)
				&& Message.isEmpty(content) && Message.isEmpty(phone)
				&& Message.isEmpty(email) && Message.isEmpty(qq)) {
			Message message = new Message();
			message.setContent(content);
			message.setEmail(email);
			message.setPhone(phone);
			message.setQq(qq);
			message.setUserName(userName);
			message.setTop(top);
			boolean result = messageService.sendMessage(message);

			if (result)
				request.dispatch("/homedesign/operateSuccess.html", response);
			else
				request.dispatch("/homedesign/operateFail.html", response);

		}

	}

	

}
