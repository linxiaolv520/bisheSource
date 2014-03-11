package cn.com.servlet;

import java.io.PrintWriter;
import java.util.List;

import net.sf.json.JSONArray;
import cn.com.dbFactory.ServiceFactory;
import cn.com.domain.Design;
import cn.com.service.DesignService;
import cn.com.tomcat.servlet.HttpServletRequest;
import cn.com.tomcat.servlet.HttpServletResponse;
import cn.com.tomcat.servlet.Servlet;

public class PriceList implements Servlet {

	DesignService designService = ServiceFactory.createDesignService();
	public static int PAGE_SIZE = 6;

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) {
		PrintWriter print = response.getOutWriter();
		int type = -1;
		if (request.getParameter("designtype") != null)
			type = Integer.parseInt((String) request.getParameter("designtype"));
		String searchStr = "";
		if (request.getParameter("search") != null)
			searchStr = (String) request.getParameter("search");
		int startRow = 0;
		if (request.getParameter("startRow") != null)
			startRow = Integer.parseInt((String) request
					.getParameter("startRow"));

		System.out.println(startRow+"startRow");
		if (request.getParameter("sum") == null) {
			List<Design> listDesign = designService.getDesignList(type,
					searchStr, startRow, PAGE_SIZE);
			  
			if (listDesign != null) {
				//System.out.println(listDesign.size()+"listSize");
				JSONArray jsonArray = JSONArray.fromObject(listDesign);
				print.print(jsonArray.toString());

			} else {
				print.print("没有查询到相应的数据列表");
			}
			print.flush();
		} else {
            int sum = designService.getSumList(type,searchStr);
            int currPage = sum%PAGE_SIZE==0?sum/PAGE_SIZE:sum/PAGE_SIZE+1;
            
            String result = "{totalPage:"+currPage+",count:"+sum+"}";
            print.print(result);
            print.flush();
		}
	}

}
