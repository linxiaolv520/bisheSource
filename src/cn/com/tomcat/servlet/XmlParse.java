package cn.com.tomcat.servlet;

import java.io.InputStream;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlParse {
	public XmlConfig parse(String xmlName) throws Exception {
		XmlConfig xml = new XmlConfig();
		InputStream in = XmlParse.class.getResourceAsStream(xmlName);
		SAXReader reader = new SAXReader();

		Document doc = reader.read(in);
		String xPath = "/web-app/servlet-mapping/url-pattern";
		List<Element> urlDocList = doc.selectNodes(xPath);
		for (Element urlElement : urlDocList) {
			String url = urlElement.getData().toString();
			List<Element> servletNameList = doc
					.selectNodes("/web-app/servlet-mapping[url-pattern='" + url
							+ "']/servlet-name");
			if (servletNameList == null || servletNameList.size() != 1)
				return null;

			String servletName = servletNameList.get(0).getData().toString();
			List<Element> classList = doc
					.selectNodes("/web-app/servlet[servlet-name='"
							+ servletName + "']/servlet-class");
			if (classList == null || classList.size() != 1)
				return null;
			String className = classList.get(0).getData().toString();
			try {
				Class classForm = Class.forName(className);
				Servlet servlet = (Servlet) classForm.newInstance();
				xml.addServlet(url, servlet);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return xml;
	}

	public XmlConfig parse() throws Exception {
		String xmlName = "/web.xml";
		return this.parse(xmlName);
	}

}
