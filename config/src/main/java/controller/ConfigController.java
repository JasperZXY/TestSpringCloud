package controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("config")
public class ConfigController {
	@Value("${hello}")
	private String hello;
	
	@RequestMapping("/hello")
	public Object hello() {
		return hello;
	}
}
