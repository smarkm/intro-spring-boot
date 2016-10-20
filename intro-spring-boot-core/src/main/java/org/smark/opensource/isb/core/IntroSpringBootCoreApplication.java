package org.smark.opensource.isb.core;

import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableAutoConfiguration
public class IntroSpringBootCoreApplication {

	@Resource
	AppService appService;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext atx =SpringApplication.run(IntroSpringBootCoreApplication.class, args);
		AppService appService =atx.getBean(AppService.class);
		appService.info();
	}
}
