package cn.ehoo.springmvc.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorldAction implements Controller { // 控制器需要实现 Controller接口

	private String helloWorld; // 该属性用于获取配置文件中的helloWorld属性
	private String viewPage; // 用于获取配置文件中的viewPage属性

	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res)

	throws ServletException, IOException { // 在该方法中处理用户请求
		Map<String, String> model = new HashMap<String, String>();
		model.put("helloWorld", getHelloWorld()); // 将helloWorld属性存入model中
		return new ModelAndView(getViewPage(), model); // 调用getViewPage获取要返回的页面
	}

	public String getHelloWorld() {
		return helloWorld;
	}

	public void setHelloWorld(String helloWorld) {
		this.helloWorld = helloWorld;
	}

	public String getViewPage() {
		return viewPage;
	}

	public void setViewPage(String viewPage) {
		this.viewPage = viewPage;
	}

	

}
