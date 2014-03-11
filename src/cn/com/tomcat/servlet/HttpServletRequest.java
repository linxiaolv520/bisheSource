package cn.com.tomcat.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import cn.com.servlet.SendMessage;

public class HttpServletRequest {
	private Map<String, Object> parameter = new HashMap<String, Object>();
	private String url;

	public HttpServletRequest(String requestStr) {
		this.parse(requestStr);
	}

	public void parse(String requstStr) {
		if (requstStr == null)
			return;
		String requestArr[] = requstStr.split("\n");
		if (requestArr[0] == null)
			return;
		String firstLineArr[] = requestArr[0].split(" ");
		// http://10.67.238.33:8080/MyGraduation/jsp/login/Login.jsp
		url = firstLineArr[1];
		if (url.startsWith("http://")) {
			int index = url.indexOf("/", "http://".length());
			// MyGraduation/jsp/login/Login.jsp
			url = firstLineArr[1].substring(index);
		}
		String parameterStr = null;
		if ("GET".equalsIgnoreCase(firstLineArr[0])) {
			int indexNode = url.indexOf("?");
			if (indexNode != -1) {
				parameterStr = url.substring(indexNode + 1, url.length());
				url = url.substring(0, indexNode);
			}
		} else {
			parameterStr = firstLineArr[firstLineArr.length - 1];

		}

		if (parameterStr != null) {
			parseParameters(parameterStr);
		}
	}

	private void parseParameters(String parameterStr) {
		// TODO Auto-generated method stub
		if (parameterStr == null)
			return;
		String[] keyValues = parameterStr.split("&");
		if (keyValues.length <= 0)
			return;
		for (String keyValue : keyValues) {
			String[] keyValueSplit = keyValue.split("=");
			if (keyValueSplit.length == 2)
				try {

					parameter.put(keyValueSplit[0], keyValueSplit[1]);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public void dispatch(String url, HttpServletResponse response) {
		// TODO Auto-generated method stub
		InputStream in = SendMessage.class.getResourceAsStream(url);
		char[] chars = new char[1024];
		InputStreamReader reader = new InputStreamReader(in);
		int count = -1;
		StringBuilder sb = new StringBuilder();
		PrintWriter out = response.getOutWriter();
		try {
			while ((count = reader.read(chars)) != -1) {
				sb.append(chars, 0, count);
			}

			out.print(sb);
			out.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.close();
			}
		}

	}

	public Object getParameter(String key) {

		return this.parameter.get(key);
	}

	public String getUrl() {
		return this.url;
	}
}
