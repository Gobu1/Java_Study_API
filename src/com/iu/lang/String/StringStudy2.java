package com.iu.lang.String;

import java.util.Scanner;

public class StringStudy2 


{
	public void ex2()
	{
		//키보드로부터 파일명을 입력받음, 파일이 이미지파일인지 아닌지 구별
		//jpg, png, gif, jpeg, 
		Scanner sc = new Scanner(System.in);
		System.out.println("파일이름과 확장자를 입력하세요");
		String input = sc.next();
		
		
		if(input.indexOf(".jpg") !=-1 || input.indexOf(".png") !=-1 || input.indexOf(".gif") !=-1
				|| input.indexOf(".jpeg") !=-1)
		{
			System.out.println("이미지 파일입니다.");
		}
		else
			System.out.println("이미지파일이 아닙니다.");
		
	}
	
	
	public void StudyIndexOfEx1()
	{
		
		String names="iu,suji,choa,hani";
		//1.names에는 몇개의 쉼표가 있는가? 출력
		//2.총 몇명입니까?
		int index = names.indexOf(',');
		int count = 0 ;
		int indexs=0;
		for(int i=0; i<(int)names.length(); i++)
		{
			if(','==names.charAt(i))
			{
				System.out.print(index+", ");
				index=names.indexOf(',', index);
				count=count+1;
			}
			
		}
		System.out.println(index);
		System.out.println(count);
		System.out.println("총 "+(count+1)+" 명 입니다.");
	}
	
	public void StudyIndexof()
	{
		String str = "Hello Java";
		int index = str.indexOf("v");
		System.out.println(str.indexOf("J"));
		System.out.println(index);
		
		String replace = str.replace('l', 'w');
		System.out.println(replace);
		System.out.println(str);
		
		str=" Google에 입사지원동기는.. Google에 입사하면 노예가.. ";
		replace = str.replaceAll("Google", "삼성");
		System.out.println(str);
		replace.trim( );
		System.out.println(replace);
		System.out.println("===========");
	}
	public void studySbustring()
	{
		//하나의 문자열을 분리하는 작업(parsing)
		String member = "iu/1234";
		String pw = member.substring(3);
		String id = member.substring(0,2);
		System.out.println(id);
		System.out.println(pw);
		
	}
}
