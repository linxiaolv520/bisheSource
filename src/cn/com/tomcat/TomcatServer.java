package cn.com.tomcat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import cn.com.tomcat.servlet.XmlConfig;
import cn.com.tomcat.servlet.XmlParse;

public class TomcatServer {
	public static XmlConfig xmlconfig = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			xmlconfig = new XmlParse().parse();   
			ServerSocket clientSocket = new ServerSocket(9999);   
			while (true) {      
				Socket socket = clientSocket.accept();     
				// new SimpleRequestThread(socket).start();  
				new RealRequestThread(socket).start();
				         
			}   
		} catch (IOException e) {
			// TODO Auto-generated catch block  
			e.printStackTrace();
		}

	}

}
