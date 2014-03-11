package cn.com.test;

import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.junit.Test;

import cn.com.tomcat.servlet.HttpServletRequest;
import cn.com.tomcat.servlet.Servlet;
import cn.com.tomcat.servlet.XmlConfig;
import cn.com.tomcat.servlet.XmlParse;

public class TomcatTest {
	@Test
	public void testGetParameter() throws Exception {
		HttpServletRequest request = new HttpServletRequest(this.getRequest());
		System.out.println(request.getParameter("password") + "name");
		System.out.println(request.getUrl() + "url");
	}

	@Test
	public void testXml() throws Exception {
		XmlParse xmlParse = new XmlParse();
		XmlConfig xmlConfig = xmlParse.parse();
		Servlet servlet = xmlConfig.findServlet("/initGroupServlet");
		System.out.println(servlet);

	}

	public String getRequest() throws Exception {
		String requestFile = "E:/temp/request.txt";
		FileInputStream file = new FileInputStream(requestFile);
		InputStreamReader inputReader = new InputStreamReader(file);
		char[] chars = new char[1024];
		int count = -1;
		StringBuffer sb = new StringBuffer();
		while ((count = inputReader.read(chars)) != -1) {
			sb.append(new String(chars, 0, count));
		}
		return sb.toString();
	}
}
