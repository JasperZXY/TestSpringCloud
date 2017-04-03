package zxy.demo.springcloud.config;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 提供配置的服务
 * 
 * @author zxy
 *
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApplicion {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ConfigApplicion.class, args);
	}

}