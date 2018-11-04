package org.smark.opensource.isb;

import org.smark.opensource.isb.webmybatis.AppService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.smark.opensource")
public class IntroSpringBootApplication {
	
	
	private static AppService appService;

	public static void main(String[] args) {
		ConfigurableApplicationContext atx = SpringApplication.run(IntroSpringBootApplication.class, args);
		
		appService = atx.getBean(AppService.class);
		appService.hello();
	}
	
}
