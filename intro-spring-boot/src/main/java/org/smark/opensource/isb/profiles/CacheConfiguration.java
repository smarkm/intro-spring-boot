package org.smark.opensource.isb.profiles;

import javax.annotation.Resource;

import org.smark.opensource.isb.cache.HelloService;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@EnableCaching
@Profile("cache")
public class CacheConfiguration {

	@Resource
	HelloService helloService;
	
	@Bean
	public String testCache() {
		System.err.println(helloService.getHelloBean());
		System.err.println(helloService.getHelloBean());
		return "test";
	}
}
