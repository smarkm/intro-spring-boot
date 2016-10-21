package org.smark.opensource.isb.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class HelloTask {

	@Scheduled(cron="*/1 * * * * ?")
	public void hello() {
		System.out.println("hello from "+this);
	}
}
