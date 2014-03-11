package cn.com.tomcat.servlet;

import java.util.HashMap;
import java.util.Map;

public class XmlConfig {
	Map<String, Servlet> servletMap;

	public XmlConfig() {
		servletMap = new HashMap<String, Servlet>();
	}

	public Servlet findServlet(String servletUrl) {
		return servletMap.get(servletUrl);
	}

	public void addServlet(String servletUrl, Servlet servlet) {
		servletMap.put(servletUrl, servlet);
	}
}
