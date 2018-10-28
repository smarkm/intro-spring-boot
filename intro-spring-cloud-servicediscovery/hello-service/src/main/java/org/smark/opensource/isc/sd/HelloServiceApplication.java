package org.smark.opensource.isc.sd;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HelloServiceApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(HelloServiceApplication.class)
			.web(true)
			.run(args); 
	}
}
