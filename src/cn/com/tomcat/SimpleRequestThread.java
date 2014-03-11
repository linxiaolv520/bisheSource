package cn.com.tomcat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 GET http://10.67.238.33:8080/MyGraduation/jsp/login/Login.jsp HTTP/1.1
 Accept: text/html, application/xhtml+xml, 
 Accept-Language: zh-CN
 User-Agent: Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)
 Accept-Encoding: gzip, deflate
 Proxy-Connection: Keep-Alive
 Host: 10.67.238.33:8080
 Pragma: no-cache
 Cookie: JSESSIONID=77469C57C4181BBB672BA578990CDA00
 */
public class SimpleRequestThread extends Thread {
	private Socket clientSocket;

	public SimpleRequestThread(Socket clientSocket) {
		this.clientSocket = clientSocket;
	}

	public void run() {
		InputStream in = null;
		OutputStream out = null;
		byte[] bytes = new byte[1024];
		try {
			in = clientSocket.getInputStream();
			out = clientSocket.getOutputStream();
			int count = in.read(bytes);
			String str = new String(bytes, 0, count);
			String[] reqStr = str.split("/n");
			if (reqStr.length <= 0)
				return;
			String firstLine = reqStr[0];
			String[] firstLineArray = firstLine.split(" ");
			if (firstLineArray.length < 1)
				return;
			String url = firstLineArray[1];
			if (url.startsWith("http://")) {
				int index = url.indexOf("/", "http://".length());
				url = url.substring(index);
			}

			in = SimpleRequestThread.class.getResourceAsStream(url);
			while ((count = in.read(bytes)) != -1) {
				out.write(bytes, 0, count);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {

					in.close();
				}
				if (out != null) {
					out.close();
				}
				if (clientSocket != null) {
					out.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
