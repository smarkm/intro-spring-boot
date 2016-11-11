package org.smark.opensource.isb.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={Application.class})
public class ApplicationTest {

	@Resource
	AppService appService;
	
	@Test
	public void hello() throws Exception {
		appService.hello();
	}
}
