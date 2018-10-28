package org.smark.opensource.isc.sd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class ZKClientApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ZKClientApplication.class)
			.run(args);

	}
}
