package zxy.demo.springcloud.configinvoke.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("config")
public class ConfigController {
	@Value("${hello}")
	private String hello;
	
	// http://localhost:8888/config/hello
	@ResponseBody
	@RequestMapping("/hello")
	public Object hello() {
		return hello;
	}
}
