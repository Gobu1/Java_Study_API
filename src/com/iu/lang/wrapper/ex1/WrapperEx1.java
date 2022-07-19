package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx1 
{
	//ex1
	//스캐너로 주민번호 입력 6-7 : 960604 - 1234567
	//1. 주민번호를 받아 남자인지 여자인지 판단
	//2. 현재 나이 출력
	//3. 3-5 월 사이는 봄, 6~8 여름, 9~11 가을, 12-2 겨울
	Scanner sc = new Scanner(System.in);
	
	public void info()
	{
		System.out.println("주민등록번호를 입력하세요");
		String num = sc.next();
		String gender = num.substring(7, 8);
		int gender1 = Integer.parseInt(gender);
		if (gender1==1 || gender1==3)
			System.out.println("남성입니다");		
		else if (gender1==2 || gender1==4)
			System.out.println("여성입니다.");		
		else 
			System.out.println("다시 입력하세요");	
		
		//private void year(String num) {
		
		String born = num.substring(0, 2);
		int born1 = Integer.parseInt(born);
		System.out.println(123-born1+" 살");
		
		//private void season(String num) {
		
		String weather = num.substring(2, 4);
		int weather1 = Integer.parseInt(weather);
		if(weather1>5 && weather1<9)
			System.out.println("여름");	
		else if (weather1>8 && weather1<12)
			System.out.println("가을");	
		else if (weather1==12 || weather1==1 || weather1==2)
			System.out.println("겨울");	
		else if (weather1>2 &&weather1<5)
			System.out.println("봄");	
		else 
			System.out.println("다시 입력하세요");	
		
	}
	

}
