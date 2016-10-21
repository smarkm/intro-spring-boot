package org.smark.opensource.isb.devtools;

import java.net.ServerSocket;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class IntroSpringBootDevtoolsApplication {

	
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext atx =SpringApplication.run(IntroSpringBootDevtoolsApplication.class, args);
		AppService appService= atx.getBean(AppService.class);
		int port =new Random().nextInt(8000);
		System.out.println("ready port:"+port);
		appService.hello();
		appService.init();
		new ServerSocket(port).accept();
	}
}
