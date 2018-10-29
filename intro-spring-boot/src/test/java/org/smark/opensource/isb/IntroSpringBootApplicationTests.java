package org.smark.opensource.isb;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.smark.opensource.isb.webmybatis.AppService;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntroSpringBootApplicationTests {
	
	@Resource
	AppService appServer;

	@Test
	public void contextLoads() {
	}

	@Test 
	public void appServerHelloTest() throws Exception {
		appServer.hello();
	}
}
