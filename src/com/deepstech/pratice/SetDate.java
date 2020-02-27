package com.deepstech.pratice;

import java.util.Calendar;
import java.util.Date;

public class SetDate {

	public  static Date getDate(int hour, int minute, int second) {

		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);

		return calendar.getTime();

	}
	
	public static int reminderInHour(int hour)
	{
		return hour*60*60*1000;
	}
	
}
