package org.smark.opensource.isb.service;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

@Service
public class AppService {

	@Resource
	SqlSessionTemplate sqlSessionTemplate;
	
	public void hello() {
		System.out.println(sqlSessionTemplate);
	}
	
}
