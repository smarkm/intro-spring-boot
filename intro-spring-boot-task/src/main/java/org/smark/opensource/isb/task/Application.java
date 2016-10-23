package org.smark.opensource.isb.task;

import org.smark.opensource.isb.tasks.SimpleTaskManager;
import org.smark.opensource.isb.tasks.TaskManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ConcurrentTaskScheduler;

@Configuration
@EnableScheduling
public class Application {

	@Bean()
	public TaskScheduler taskScheduler() {
		ConcurrentTaskScheduler taskScheduler = new ConcurrentTaskScheduler();
		return taskScheduler;
	}
	
	@Bean()
	public TaskManager taskManager() {
		TaskManager taskManager = new SimpleTaskManager();
		return taskManager;
	}
	
}
