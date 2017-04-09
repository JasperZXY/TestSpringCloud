package zxy.demo.springboot.boot_feature.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import zxy.demo.springboot.boot_feature.dao.UserMapper;
import zxy.demo.springboot.boot_feature.entity.UserExample;

@RequestMapping("user")
@RestController
public class UserController {
	@Autowired
	private UserMapper userMapper;
	
	@GetMapping("/list/all")
	public Object listAll() {
		return userMapper.selectByExample(new UserExample());
	}

}
