package zxy.demo.springcloud.eurekainvoke2.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SimpleService {
	@Autowired
	private RestTemplate restTemplate;

	private static final String SERVICE_NAME = "eureka-invoke1";

	public Map<String, Object> getData() {
		Map<String, Object> retMap = new HashMap<String, Object>();

		Map<String, Object> helloMap = restTemplate.getForObject("http://" + SERVICE_NAME + "/hello", Map.class);
		retMap.putAll(helloMap);

		Map<String, Object> nowMap = restTemplate.getForObject("http://" + SERVICE_NAME + "/now", Map.class);
		retMap.putAll(nowMap);

		return retMap;
	}

}
