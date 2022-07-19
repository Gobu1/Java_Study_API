package com.iu.lang.String;

public class StringMain
{

	public static void main(String[] args)
	{
		String str1 = "iu";
		String str2 = "iu";
		String str3 = new String("iu");
		
//		System.out.println(str1==str2); //메소드의 상수영역에 담긴 값이 같기때문에 주소가 같다.
//		System.out.println(str1 == str3);	   //주소가 다르다
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
//		
//		System.out.println("==========");
//		System.out.println(str1.equals(str3));
//		System.out.println(str1.equals(str2));
//		StringStudy ss = new StringStudy();
//		ss.studyCharAt();
		StringStudy2 st2 = new StringStudy2();
		StringStudy3 st3 = new StringStudy3();
//		st2.StudyIndexof();
//		st2.StudyIndexOfEx1();
//		st2.studySbustring();
//		st2.ex2();
		st3.studySplit();
	}

}
