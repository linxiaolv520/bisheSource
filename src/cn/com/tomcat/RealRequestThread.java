package cn.com.tomcat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

import cn.com.tomcat.servlet.HttpServletRequest;
import cn.com.tomcat.servlet.HttpServletResponse;
import cn.com.tomcat.servlet.Servlet;
import cn.com.tomcat.servlet.XmlConfig;

public class RealRequestThread extends Thread {
	// 浠巆lient socket涓幏鍙杋n 鍜宱ut
	// 浠巌n涓幏鍙栬姹傚瓧绗︿覆
	// 鍒涘缓涓�釜HttpServletRequest瀵硅薄(瀹屾垚瀵硅姹傚瓧绗︿覆鐨勮В鏋�
	// 鍒涘缓涓�釜HttpServletResponse瀵硅薄
	// 浠嶳equest涓幏鍙栬姹傚悕绉癠rl
	// 鏍规嵁urlName浠巜eb.xml鐨勫搴旂殑瀵硅薄涓紝鑾峰彇鍝嶅簲鐨剆ervlet瀵硅薄
	// 濡傛灉瀵硅薄瀛樺湪锛岃皟鐢╯erlvet瀵硅薄鐨剆ervice(request,reponse)
	// 鍚﹀垯锛岀洿鎺ヨ鍙杣rlName瀵瑰簲鐨勮祫婧愶紝骞跺啓鍏ut
	private Socket clientSocket;

	public RealRequestThread(Socket clientSocket) {
		this.clientSocket = clientSocket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		InputStream in = null;
		OutputStream out = null;
		try {
			in = this.clientSocket.getInputStream();
			out = this.clientSocket.getOutputStream();
			byte[] bytes = new byte[1024];
			int count = -1;
			char[] chars = new char[1024];
			BufferedReader br = new BufferedReader(new InputStreamReader(in,
					"utf-8"));
			count = br.read(chars);
			String requestStr = new String(chars, 0, count);
			requestStr = java.net.URLDecoder.decode(requestStr, "utf-8");

			HttpServletResponse response = new HttpServletResponse(out);
			HttpServletRequest request = new HttpServletRequest(requestStr);
			String url = request.getUrl();
			XmlConfig config = TomcatServer.xmlconfig;
			Servlet servlet = config.findServlet(url);
			if (servlet != null)
				servlet.service(request, response);
			else {
				InputStream resourceIn = RealRequestThread.class
						.getResourceAsStream(url);
				while ((count = resourceIn.read(bytes)) != -1) {
					out.write(bytes, 0, count);
				}
				out.flush();
			}

		} catch (Exception e) {
            e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
				clientSocket.close();
			} catch (Exception e) {

			}
		}

	}

}
