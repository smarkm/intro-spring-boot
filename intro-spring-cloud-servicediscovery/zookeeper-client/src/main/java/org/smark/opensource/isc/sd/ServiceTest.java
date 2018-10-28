package org.smark.opensource.isc.sd;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.print.Doc;
import javax.swing.Spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;

@Component
public class ServiceTest {
	Logger log = LoggerFactory.getLogger(ServiceTest.class);

	@Resource
	DiscoveryClient discoveryClient;
	
	String helloService = "helloService";
	
	ServiceInstance serviceInstance;
	
	@PostConstruct
	public void init() throws InterruptedException {
		boolean hasService = test();
		while(!hasService) {
			test();
			Thread.sleep(3000);
		}
	}
	public boolean test() throws InterruptedException {
		List<ServiceInstance> instances = discoveryClient.getInstances("zookeeper.client");
		System.err.println(discoveryClient.getServices());
		if (instances ==null || instances.isEmpty()) {
			log.error("not fond service:"+helloService);
			return false;
		}else {
			serviceInstance = instances.get(0);
			log.info(serviceInstance.toString());
		}
		return true;
	}
	
	
	
}
