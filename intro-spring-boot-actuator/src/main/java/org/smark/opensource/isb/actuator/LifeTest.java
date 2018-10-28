package org.smark.opensource.isb.actuator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.SmartLifecycle;

public class LifeTest implements SmartLifecycle,ApplicationContextAware {

	
	private static final Logger log = LoggerFactory.getLogger(LifeTest.class);

	@Override
	public void start() {
		log.info("this test started ...");
	}

	@Override
	public void stop() {

	}

	@Override
	public boolean isRunning() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getPhase() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAutoStartup() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void stop(Runnable callback) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		
	}

}
