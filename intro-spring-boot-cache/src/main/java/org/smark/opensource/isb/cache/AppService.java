package org.smark.opensource.isb.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class AppService {

	public void hello() {
		System.out.println("hello from "+this);
	}
	
	@Cacheable(value="user")
	public String get(String name) {
		User user = new User();
		System.out.println("load from persisten"+user);
		return "Hello";
	}
}
