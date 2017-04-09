package zxy.demo.springboot.boot_feature.web;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class SampleController {

	@ResponseBody
	@RequestMapping(value = "/")
	String home() {
		return "Spring Boot features";
	}

}