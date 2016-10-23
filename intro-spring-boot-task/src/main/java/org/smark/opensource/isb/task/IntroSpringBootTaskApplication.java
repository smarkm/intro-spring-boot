package org.smark.opensource.isb.task;

import java.io.IOException;

import org.smark.opensource.isb.tasks.EmailTask;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.support.CronTrigger;

@SpringBootApplication
public class IntroSpringBootTaskApplication {
	

	public static void main(String[] args) throws InterruptedException, IOException  {
		ConfigurableApplicationContext atx = SpringApplication.run(IntroSpringBootTaskApplication.class, args);
		TaskScheduler taskScheduler =atx.getBean(TaskScheduler.class);
		EmailTask task = new EmailTask(new CronTrigger("*/1  * * * * *"));
		taskScheduler.schedule(task,task.getTrigger());
		
		Thread.sleep(Integer.MAX_VALUE);
		
	}
}
