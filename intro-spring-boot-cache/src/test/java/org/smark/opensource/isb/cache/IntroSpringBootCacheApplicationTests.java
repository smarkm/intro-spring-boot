package org.smark.opensource.isb.cache;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntroSpringBootCacheApplicationTests {
	
	@Resource
	AppService appServer;
	
	@Resource
	ApplicationContext atx;

	@Test
	public void hello() {
		
		User user = new User("111", "smark", "123");
		String usesr = appServer.get("123");
		System.out.println(user);
		usesr = appServer.get("123");
		System.out.println(user);
	}

}
