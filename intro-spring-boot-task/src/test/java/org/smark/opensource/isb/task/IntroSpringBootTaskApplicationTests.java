package org.smark.opensource.isb.task;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.smark.opensource.isb.tasks.EmailTask;
import org.smark.opensource.isb.tasks.Task;
import org.smark.opensource.isb.tasks.TaskManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntroSpringBootTaskApplicationTests {
	
	@Resource
	TaskManager taskManager;
	 
	@Resource
	TaskScheduler taskScheduler;
	@Before
	public void before() {
		Task task = new EmailTask("email",new CronTrigger("*/1 * * * * *"));
		System.out.println(task);
		taskManager.add(task);
	}
	
	@Test
	public void contextLoads() throws InterruptedException {
		Thread.sleep(Integer.MAX_VALUE);
	}

	
	@Test
	public void serilization() throws Exception {
		
		taskManager.allTasks().forEach((taskId,task)->{
			taskScheduler.schedule(task, ((EmailTask)task).getTrigger());
		});
		Thread.sleep(Integer.MAX_VALUE);
	}
}
