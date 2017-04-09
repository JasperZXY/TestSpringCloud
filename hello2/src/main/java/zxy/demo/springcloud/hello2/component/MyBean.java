package zxy.demo.springcloud.hello2.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class MyBean {
	@Autowired
    public MyBean(ApplicationArguments args) {
		System.out.println(args.getNonOptionArgs());
    }

}
