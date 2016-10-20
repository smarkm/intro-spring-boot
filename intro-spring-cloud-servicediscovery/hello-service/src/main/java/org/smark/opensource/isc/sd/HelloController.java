package org.smark.opensource.isc.sd;


import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private  final Logger logger = Logger.getLogger(getClass());
	
	@Resource
	DiscoveryClient client;
	
	@RequestMapping("/hello")
	public String hello(String name) {
		ServiceInstance instance = client.getLocalServiceInstance();
		String str = "hello from server[]";
		logger.info("/hello,host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
		return str;
	}
	
	@RequestMapping("/info")
	public String info(String name) {
		ServiceInstance instance = client.getLocalServiceInstance();
		String str = "/hello,host:" + instance.getHost() + ", service_id:" + instance.getServiceId();
		logger.info("/hello,host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
		return str;
	}
}
