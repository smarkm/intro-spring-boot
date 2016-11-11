package org.smark.opensource.isb.devtools;

import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroSpringBootDevtoolsApplication {
	
	@Resource
	AppService appService;

	static{
	}
	
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(IntroSpringBootDevtoolsApplication.class, args);
		Thread.sleep(Integer.MAX_VALUE);
	}
}
