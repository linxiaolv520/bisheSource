package cn.com.servlet;

import cn.com.dbFactory.ServiceFactory;
import cn.com.service.MessageService;
import cn.com.tomcat.servlet.HttpServletRequest;
import cn.com.tomcat.servlet.HttpServletResponse;
import cn.com.tomcat.servlet.Servlet;

public class MessageList implements Servlet {
    MessageService messageService = ServiceFactory.createMessageService();
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	  if(request.getParameter("")!=null&&request.getParameter("")!=null){
		int startRow =Integer.parseInt((String)request.getParameter("startRow")); 
		int endRow =Integer.parseInt((String)request.getParameter("endRow"));
		
	  }
       messageService.getMessageList(startRow, endRow); 
	}

}
