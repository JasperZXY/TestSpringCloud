package zxy.demo.springcloud.hello2.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class SampleController {

	@ResponseBody
	@RequestMapping(value = "/")
	String home() {
		return "Hello World!";
	}

}