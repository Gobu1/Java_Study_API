package com.iu.lang;

import java.util.Scanner;

//import java.util.*;

public class LangMain 
{
	public static void main(String []args)
	{
		
		Object obj  = new Object();
		String str =obj.toString();
		Member member = new Member();
		System.out.println(str);
		str = member.toString();
		System.out.println(str);
		Memberclient mc = new Memberclient();
		Car car = new Car();
		Car car2 = new Car();
		obj=member;
		
		
//		Object [] obs = {obj, car, mc, member};
		boolean check = car.equals(car2);
		System.out.println(check);
		System.out.println(car);
		System.out.println(car.toString());
		String name = "iu";
		System.out.println(name);
		
		
	}
	
}
