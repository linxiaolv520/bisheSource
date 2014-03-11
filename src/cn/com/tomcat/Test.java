package cn.com.tomcat;

import java.io.IOException;
import java.io.InputStream;

public class Test {
	public static void main(String[] agrs) throws IOException {
		byte[] bytes = new byte[1024];
		InputStream in = System.in;
		int count = in.read(bytes);
		String str = new String(bytes, 0, count);
		str = "123&456";
		int index = str.indexOf("&");

		System.out.println(str.substring(0, index) + "dd" + index);
	}

}
