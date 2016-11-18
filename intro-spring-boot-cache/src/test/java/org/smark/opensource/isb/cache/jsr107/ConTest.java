package org.smark.opensource.isb.cache.jsr107;

import javax.cache.Cache;
import javax.cache.CacheManager;
import javax.cache.Caching;
import javax.cache.configuration.MutableConfiguration;
import javax.cache.spi.CachingProvider;

import org.junit.Test;

public class ConTest {

	@Test
	public void testName() throws Exception {
		CachingProvider jcacheProvider = Caching.getCachingProvider();
		CacheManager cacheManager = jcacheProvider.getCacheManager();
		MutableConfiguration<String, String> configuration = new MutableConfiguration<>();
		configuration.setTypes(String.class, String.class);
		// create a cache using the supplied configuration
		Cache<String, String> cache = cacheManager.createCache("myCache", configuration);
		System.out.println(cacheManager);
		System.out.println(jcacheProvider.getCacheManager());
		ObjectManager objectManager = new ObjectManager();
		User user = objectManager.getUser("smark");
		System.out.println(user);
		user = objectManager.getUser("smark");
		System.out.println(user);
		
		cache.put("smark", "hell");
		System.out.println(cache.get("smark"));
	}
}
