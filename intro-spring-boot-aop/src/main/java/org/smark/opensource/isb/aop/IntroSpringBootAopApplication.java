package org.smark.opensource.isb.aop;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class IntroSpringBootAopApplication {

	public static void main(String[] args) throws IOException {
		
		ConfigurableApplicationContext atx =SpringApplication.run(IntroSpringBootAopApplication.class, args);
		AppService appService =atx.getBean(AppService.class);
		appService.init();
		appService.hello();
		
		new ServerSocket(new Random().nextInt(8000)).accept();
	}
}
