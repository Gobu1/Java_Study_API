package com.iu.lang.wrapper;

import java.sql.Wrapper;

public class WrapperMain1
{

	public static void main(String[] args)
	{
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		String num="10";
		
		Integer integer = new Integer(num);
		int n = integer.intValue();
		
		n=50;
		integer = new Integer(n);
		//생성자를 통해 클래스로 변환시켜야하지만 이를 자동으로 하게 만들어놓음 - auto-boxing
		
		System.out.println(num+2);
		integer = n;
		n = integer;
		
		long l = 10L;
		Long ll = l;
		
		integer = (int)l;
		
		String num1="30";
		String num2="3.12";
		String num3="60";
		
		int n1 = Integer.parseInt(num1);
		System.out.println(n1*2);
		double n2 = Double.parseDouble(num2);
		System.out.println(n2*2);
		long n3 = Long.parseLong(num3);
		System.out.println(n3*2);
		
		
		
		
		
	}

}
