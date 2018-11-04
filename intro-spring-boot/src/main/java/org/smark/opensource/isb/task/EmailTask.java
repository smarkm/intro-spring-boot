package org.smark.opensource.isb.task;

import org.springframework.scheduling.Trigger;

public class EmailTask extends Task {
	
	private Trigger trigger;
	
	public EmailTask() {
	}
	
	
	
	public EmailTask(String taskId, Trigger trigger) {
		super(taskId);
		this.trigger = trigger;
	}



	public EmailTask(Trigger trigger) {
		super();
		this.trigger = trigger;
	}

	@Override
	public void run() {
		System.out.println("send email");
	}

	public Trigger getTrigger() {
		return trigger;
	}

	public void setTrigger(Trigger trigger) {
		this.trigger = trigger;
	}
	
	
	
}
