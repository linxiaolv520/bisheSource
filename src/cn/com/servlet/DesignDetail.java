package cn.com.servlet;

import java.io.PrintWriter;

import cn.com.dbFactory.ServiceFactory;
import cn.com.domain.Design;
import cn.com.service.DesignService;
import cn.com.tomcat.servlet.HttpServletRequest;
import cn.com.tomcat.servlet.HttpServletResponse;
import cn.com.tomcat.servlet.Servlet;
import cn.com.until.MemcachedUtil;

public class DesignDetail implements Servlet {
   DesignService designService = ServiceFactory.createDesignService();
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
      if(request.getParameter("pictureId")!=null){
    	  int pictureId = Integer.parseInt((String) request.getParameter("pictureId"));
    	  Design design =designService.getDesignbyID(pictureId);    	  
    	  if(design !=null&&MemcachedUtil.add(Design.designDO, design)){  		
    	     request.dispatch("/homedesign/designDetail.html", response);    		 
    	  }else{
    		  request.dispatch("/homedesign/operateFail.html", response); 
    	  }
    	  
      }else{
    	 Object obj= MemcachedUtil.get(Design.designDO);
    	 if(obj !=null){
    		 Design design = (Design)obj;
    		String result="{name:'"+design.getName()+"',bigpicturesystemname:'"+design.getBigPictureSystemName()+"',description:'"+design.getDescription()+"'}";
    		PrintWriter print = response.getOutWriter();
    		print.print(result);
    		print.flush();
    	 }
    		 
      }
      
      
	}

}
