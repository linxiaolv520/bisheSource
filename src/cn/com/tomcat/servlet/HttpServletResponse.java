package cn.com.tomcat.servlet;

import java.io.OutputStream;
import java.io.PrintWriter;

public class HttpServletResponse {
	private PrintWriter out;

	public HttpServletResponse(OutputStream outPutStream) {
		out = new PrintWriter(outPutStream);

	}

	public PrintWriter getOutWriter() {
		return out;
	}
}
