package zxy.demo.springcloud.configinvoke;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

/**
 * 需要获取配置的服务
 * 
 * @author zxy
 *
 */
@SpringBootApplication
public class MainApplicion {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MainApplicion.class, args);
	}

}