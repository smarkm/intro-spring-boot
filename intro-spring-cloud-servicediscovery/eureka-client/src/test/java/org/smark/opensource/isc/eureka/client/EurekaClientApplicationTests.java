package org.smark.opensource.isc.eureka.client;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaClientApplicationTests {

	@Resource
	DiscoveryClient client;
	@Resource
	HelloServiceProxy proxy;
	@Test
	public void contextLoads() {
		List<ServiceInstance> helloService = client.getInstances("helloService");
		System.out.println(helloService);
		System.out.println(proxy.hello());
	}

}
