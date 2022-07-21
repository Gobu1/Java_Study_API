package com.iu.util.list.calander;

import java.util.Calendar;

public class CalenderMain3 
{

	public static void main(String[] args) 
	{
		Calendar ca = Calendar.getInstance();
		ca.set(2022,11,31,23,59,50);
		System.out.println(ca.getTime());
		
		long now = ca.getTimeInMillis();
		now = now + 10000;
		ca.setTimeInMillis(now);
		System.out.println(ca.getTime());
		
	}

}
