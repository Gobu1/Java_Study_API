package com.iu.lang.String;

public class StringStudy 
{
	
	public void studyCharAt()
	{
		char [] ch = {'H','e','l','l','o',' ','W','o','r','l','d'};
		String str = "Wellcome to hell";
		System.out.println(ch[0]);
		
		System.out.println(ch[0]);
		char c = str.charAt(0);
		System.out.println(c);
		c=str.charAt(1);
		System.out.println(c);
		
		System.out.println(str.length());
		System.out.println("============");
		//str 문자열을 하나씩 꺼내서 출력
		for(int i=0; i<str.length(); i++)
		{
			
			char h=str.charAt(i);
			System.out.print(h);
		}
		
	}
	
}
