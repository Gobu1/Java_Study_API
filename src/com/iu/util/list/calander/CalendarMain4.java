package com.iu.util.list.calander;


import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMain4 
{

	public static void main(String[] args) 
	{
		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getTime());
		
//		ca.roll(Calendar.MINUTE, 20); (분만바뀜)지정한 필드만
		ca.add(Calendar.MINUTE, 20); //(시간도 바뀜)
		System.out.println(ca.getTime());
		
		System.out.println("========");
		ca = Calendar.getInstance();
		String pattern = "yyyy년 MM월 dd일 E";
		SimpleDateFormat sd = new SimpleDateFormat();
		String time=sd.format(ca.getTime());
		System.out.println(time);
		
	}

}
