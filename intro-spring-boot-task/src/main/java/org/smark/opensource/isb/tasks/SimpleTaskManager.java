package org.smark.opensource.isb.tasks;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.Assert;


public class SimpleTaskManager implements TaskManager {
	private Map<String, Task> tasks = new HashMap<>();

	@Override
	public Task getTask(String taskId) {
		return tasks.get(taskId);
	}

	@Override
	public void add(Task task) {
		Assert.isTrue(!tasks.containsKey(task.getTaskId()),"has taskId exsit");
		tasks.put(task.getTaskId(), task);
	}

	@Override
	public Map<String, Task> allTasks() {
		return tasks;
	}

}
