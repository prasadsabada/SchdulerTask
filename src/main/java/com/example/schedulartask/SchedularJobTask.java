package com.example.schedulartask;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class SchedularJobTask {
	
	@Scheduled(fixedRate = 5000)
	public void startTask() {
		System.out.println("SchedularJobTask.startTask()............... job started");
	}

}
