package org.smark.opensource.isb.tasks;

import java.util.Map;

public interface TaskManager {

	public Task getTask(String taskId);
	public void add(Task task);
	public Map<String, Task> allTasks();
	
}
