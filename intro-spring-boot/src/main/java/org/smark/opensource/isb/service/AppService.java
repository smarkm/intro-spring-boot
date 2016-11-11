package org.smark.opensource.isb.service;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AppService {
	
	@Value("${spring.application.name}")
	String appName;
	
	@Value("${app.version}")
	String appVersion;
	
	@Resource
	SqlSessionTemplate sqlSessionTemplate;
	
	public void hello() {
		System.out.println("hello from :"+this);
		System.out.println(appName);
		System.out.println(appVersion);
	}
	
}
