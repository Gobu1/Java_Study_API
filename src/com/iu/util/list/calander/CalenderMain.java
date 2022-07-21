package com.iu.util.list.calander;

import java.util.Calendar;

public class CalenderMain 
{
	public static void main (String []args)

	{
		//현재 년 월일 시분초 *밀리세컨즈
		Calendar ca = Calendar.getInstance();
		System.out.println(ca);
		
		int y=ca.get(ca.YEAR);
		int y1=ca.get(ca.MONTH);
		//YEAR MONTH DAY_OF_MONTH HOUT_OF_DAY MINUTE SECOND
		System.out.println(y);
		System.out.println(y1 );
		
	}
}
