package org.smark.opensource.isb;

import org.junit.Test;
import org.smark.opensource.isb.service.AppService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationTest {

	ApplicationContext atx = new AnnotationConfigApplicationContext(IntroSpringBootApplication.class);
	@Test
	public void helloTest() throws Exception {
		System.out.println(atx.getBean(AppService.class));
	}
}
