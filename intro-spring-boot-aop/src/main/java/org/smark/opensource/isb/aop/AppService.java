package org.smark.opensource.isb.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AppService {
	
	@Value("${spring.application.name}")
	String name;

	public void hello() {
		System.out.println("hello from: "+name);
	}
	
	public void init() {
		System.out.println("init "+name);
	}
}
