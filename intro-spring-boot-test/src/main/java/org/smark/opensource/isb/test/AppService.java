package org.smark.opensource.isb.test;

import org.springframework.stereotype.Service;

@Service
public class AppService {

	public void hello() {
		System.out.println("hello from " + this);
	}
	
}
