package zxy.demo.springcloud.configinvoke.controller;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/config")
@Controller
public class ConfigController {
	@Value("${hello}")
	private String hello;
	
	// http://localhost:8083/config/hello
	@ResponseBody
	@RequestMapping("hello")
	public Object hello() {
		return Collections.singletonMap("data", hello);
	}
}
