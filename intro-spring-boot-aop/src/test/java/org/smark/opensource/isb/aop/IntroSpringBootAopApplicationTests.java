package org.smark.opensource.isb.aop;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntroSpringBootAopApplicationTests {

	@Resource
	AppService appService;
	
	@Test
	public void contextLoads() {
		appService.init();
		appService.hello();
	}

}
