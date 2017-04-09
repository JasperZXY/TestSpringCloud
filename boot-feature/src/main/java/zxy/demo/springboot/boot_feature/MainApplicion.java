package zxy.demo.springboot.boot_feature;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.web.servlet.ServletComponentScan;

// MyBatis 支持
@MapperScan("zxy.demo.springboot.boot_feature.dao")
// filter 支持
@ServletComponentScan(basePackages="zxy.demo.springboot.boot_feature.web")
@SpringBootApplication
public class MainApplicion {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MainApplicion.class, args);
	}

}