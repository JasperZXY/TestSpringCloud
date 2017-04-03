package zxy.demo.springcloud.eurekainvoke1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 这个做服务提供方
 * @author zxy
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaInvoke1Application {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaInvoke1Application.class, args);
	}

}
