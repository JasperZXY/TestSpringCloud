package zxy.demo.springcloud.eurekainvoke2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 这个做服务调用方
 * @author zxy
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaInvoke2Application {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaInvoke2Application.class, args);
	}
	
	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
