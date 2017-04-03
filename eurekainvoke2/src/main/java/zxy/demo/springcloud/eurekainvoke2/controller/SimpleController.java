package zxy.demo.springcloud.eurekainvoke2.controller;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import zxy.demo.springcloud.eurekainvoke2.service.SimpleService;

@RestController
public class SimpleController {
	@Autowired
	private SimpleService simpleService;
	
	@RequestMapping("data")
	public Object data() {
		return simpleService.getData();
	}
	
}
