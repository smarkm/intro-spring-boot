package org.smark.opensource.isb.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

	@Cacheable
	public HelloBean getHelloBean() {
		return new HelloBean();
	}
}
