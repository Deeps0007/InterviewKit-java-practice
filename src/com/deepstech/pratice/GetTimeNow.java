package com.deepstech.pratice;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class Task1 extends TimerTask {
	
	@Override
	public void run() {

		System.out.println("Task Execute");
	}
}
public class GetTimeNow extends Task1
{
	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY,11);
		calendar.set(Calendar.MINUTE,40);
		calendar.set(Calendar.SECOND,30);
		
		Date date = calendar.getTime();
		
		Timer timer = new Timer();
		timer.schedule(new GetTimeNow(), date, new Integer(10000));

	}

}
