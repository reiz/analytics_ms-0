package de.factfinder.analyticsms.tasks;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTask {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	public void runBackgroundJob() {
		System.out.println("The time is now " + dateFormat.format(new Date()));
		// TODO implement me!
	}

}
