package org.smark.opensource.isb.cache;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@AutoConfigureCache
@CacheConfig
public class IntroSpringBootCacheApplication {
	@Bean
	public SimpleCacheManager simpleCacheManager() {
		 SimpleCacheManager cacheManager = new SimpleCacheManager();
	       Cache cache1 = new ConcurrentMapCache("user");
	       Cache cache2 = new ConcurrentMapCache("mycachetwo");
	       cacheManager.setCaches(Arrays.asList(cache1, cache2));
	       return cacheManager;
	}

	public static void main(String[] args) {
		SpringApplication.run(IntroSpringBootCacheApplication.class, args);
	}
}
