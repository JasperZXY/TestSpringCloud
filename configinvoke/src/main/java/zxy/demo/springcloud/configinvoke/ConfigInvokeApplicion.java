package zxy.demo.springcloud.configinvoke;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

/**
 * 需要获取配置的服务
 * 
 * 需要注意的地方
 * 1、配置文件中的中文要用Unicode编码
 * 2、修改后需要上传到git才能生效
 * 3、启动的时候拉取配置文件，所以配置文件修改，配置服务不需要修改，当前服务修改即可
 * 
 * @author zxy
 *
 */
@SpringBootApplication
public class ConfigInvokeApplicion {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ConfigInvokeApplicion.class, "--config.profile=dev");
	}

}