package org.smark.opensource.isb.devtools;

import java.net.ServerSocket;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntroSpringBootDevtoolsApplicationTests {
	
	@Resource
	AppService appService;

	@Test
	public void contextLoads() throws Exception {
		System.setProperty("spring.devtools.restart.enabled", "true");
		new Thread(()->{
			appService.hello();
		}).start();
		
		new ServerSocket(8888).accept();
	}

}
