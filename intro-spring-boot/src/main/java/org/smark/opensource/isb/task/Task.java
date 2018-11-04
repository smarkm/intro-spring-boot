package org.smark.opensource.isb.task;

public class Task implements Runnable {
	private String taskId;
	
	
	public Task() {
		super();
	}

	public Task(String taskId) {
		super();
		this.taskId = taskId;
	}

	@Override
	public void run() {
		
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
