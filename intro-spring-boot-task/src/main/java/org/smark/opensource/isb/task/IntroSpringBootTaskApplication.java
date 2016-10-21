package org.smark.opensource.isb.task;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class IntroSpringBootTaskApplication {

	public static void main(String[] args) throws InterruptedException, IOException  {
		SpringApplication.run(IntroSpringBootTaskApplication.class, args);
		
		Thread.sleep(Integer.MAX_VALUE);
	}
}
