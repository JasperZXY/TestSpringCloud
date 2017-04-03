package zxy.demo.springcloud.eurekainvoke1.controller;

import java.util.Collections;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	@RequestMapping("hello")
	public Object hello() {
		return Collections.singletonMap("hello", "你好");
	}
	
	@RequestMapping("now")
	public Object now() {
		return Collections.singletonMap("now", new Date());
	}
}
