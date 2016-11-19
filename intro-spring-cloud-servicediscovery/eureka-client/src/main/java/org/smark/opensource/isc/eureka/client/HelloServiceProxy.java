package org.smark.opensource.isc.eureka.client;

import java.io.IOException;
import java.net.URI;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.http.client.fluent.Request;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceProxy {
	
	@Resource
	DiscoveryClient discoveryClient;
	
	String helloServiceName="helloService";
	
	ServiceInstance serviceInstance;
	
	@PostConstruct
	public void  init() {
		List<ServiceInstance> service = discoveryClient.getInstances(helloServiceName);
		serviceInstance = service.get(0);
		System.out.println(serviceInstance);
	}
	

	public String connectServer() {
		return serviceInstance.getUri().toString();
	}
	public String hello(){
		URI uri = serviceInstance.getUri();
		String hello = "";
		try {
			hello = Request.Get(uri).execute().returnContent().asString();
		} catch (IOException e) {
			hello = "server "+uri+" faild request";
			handlerServerFaild();
			//e.printStackTrace(); 
		}
		return hello;
	}
	
	public void handlerServerFaild() {
		List<ServiceInstance> service = discoveryClient.getInstances(helloServiceName);
		serviceInstance = service.get(0);
	}
}
