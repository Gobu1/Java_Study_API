package com.iu.lang.String;

public class StringStudy3 
{
	
	public void studySplit3()
	{
		String info = "서울,대전-대구,부산-제주,광주-강릉";
		
		info = info.replace(",", "-");
	
		System.out.println(info);
		String[] names = info.split("-");
		for(String name : names)
		{
			System.out.println(name);
		}
				
	}
	
	
	public void studySplit2()
	{
		String info="1997 12 24";
		String[] names = info.split(" ");
		for(String name : names)
		{
			System.out.println(name);
		}
	}
	
	
	
	public void studySplit()
	{
		String str = "i1,i2,i3,i4";
		//String str2 = new String(""); //스트링은 특수한편
		String []names = str.split(","); //파싱
//		for(int i=0; i<4;i++)
//		{
//		System.out.println(names[i]);
//		}
		//향상된 for문 - for(배열에모은데이터타입 변수명 : 배열참조변수명){}
		for(String name : names)
		{
			System.out.println(name);
		}
	}

}
