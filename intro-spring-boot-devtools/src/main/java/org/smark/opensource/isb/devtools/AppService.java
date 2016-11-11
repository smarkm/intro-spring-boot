package org.smark.opensource.isb.devtools;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AppService {

	@Value("${spring.application.name}")
	String name;
	static{
		System.out.println("hello from "+AppService.class.getName());
	}
	public void hello() {
		System.out.println("hello from : "+name);
	}
	
	public void init() {
		System.out.println("init server");
	}
}
