package org.smark.opensource.isc.eureka.client;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Resource
	HelloServiceProxy helloService;
	
	@RequestMapping("hello")
	public String hello(String name) {
		return helloService.hello()+name;
	}
	
	@RequestMapping("server")
	public String server(String name) {
		return helloService.connectServer();
	}
}
