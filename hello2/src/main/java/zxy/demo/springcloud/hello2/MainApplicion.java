package zxy.demo.springcloud.hello2;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

// Using Spring Boot without the parent POM
@SpringBootApplication
public class MainApplicion {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MainApplicion.class, args);
	}

}