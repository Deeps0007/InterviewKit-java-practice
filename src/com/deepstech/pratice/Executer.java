package com.deepstech.pratice;

import java.util.Date;
import java.util.Timer;

public class Executer {

	public static void main(String[] args) {

		Timer timer = new Timer();
		Date date = SetDate.getDate(17, 50, 0);
		timer.schedule(new TimedTask(), date, SetDate.reminderInHour(1));
	}
	
//	public void schedule(Runnable runnable, Date date, long repeatAfter) {
//		new Timer().schedule(() -> runnable.run(), date, repeatAfter);
//	}
}

