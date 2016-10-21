package org.smark.opensource.isb.core;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntroSpringBootCoreApplicationTests {

	@Resource
	AppService appService;
	
	@Test
	public void contextLoads() {
		appService.info();
		assertEquals(1, 1);
	}

}
