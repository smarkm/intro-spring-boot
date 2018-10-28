package org.smark.opensource.isb.actuator;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class IntroSpringBootActuatorApplication {

	public static void main(String[] args) throws InterruptedException {
		new SpringApplicationBuilder(IntroSpringBootActuatorApplication.class)
			.web(true)
			.run(args);
	}
}
