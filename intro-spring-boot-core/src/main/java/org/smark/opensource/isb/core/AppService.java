package org.smark.opensource.isb.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AppService {
	
	@Value("${author}")
	String author;
	
	@Value("${spring.application.name}")
	String app;
	
	public void info() {
		System.out.println("appname: "+app+", author: "+author);
	}
}
