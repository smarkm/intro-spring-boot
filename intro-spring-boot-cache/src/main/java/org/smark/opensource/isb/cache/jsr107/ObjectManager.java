package org.smark.opensource.isb.cache.jsr107;

import javax.cache.annotation.CacheDefaults;
import javax.cache.annotation.CacheResult;

@CacheDefaults(cacheName="userCache")
public class ObjectManager {

	@CacheResult
	public User getUser(String name) {
		System.out.println("load user from db");
		return new User(name+"-id", name, name+"-password");
	}
}
