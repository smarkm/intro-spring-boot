package org.smark.opensource.isb.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@Profile("task")
public class TaskConfiguration {

}
