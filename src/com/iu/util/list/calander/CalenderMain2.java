package com.iu.util.list.calander;

import java.util.Calendar;
import java.util.Date;

public class CalenderMain2
{

	public static void main(String[] args) 
	{
		Calendar now = Calendar.getInstance();
		
		Calendar future = Calendar.getInstance();
		future.set(Calendar.MINUTE, 15);
		Calendar birth = Calendar.getInstance();
		
		birth.set(Calendar.YEAR,1996);
		birth.set(Calendar.MONTH,06);
		birth.set(Calendar.DAY_OF_MONTH, 04);
		
		long n = now.getTimeInMillis();
		long f = future.getTimeInMillis();
		long b = birth.getTimeInMillis();
		long result = f - n;
		System.out.println(result/1000);
		
		long result2 = n-b;
		System.out.println(result2/(1000*60*60*24)/365);
		
		Date date = now.getTime();
		System.out.println(date);
		
	}

}
