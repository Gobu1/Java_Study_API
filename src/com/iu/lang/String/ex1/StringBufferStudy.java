package com.iu.lang.String.ex1;

public class StringBufferStudy 
{

	public static void main(String[] args) 
	{
		String str1 = "max";
		String str2 = "age";
		
//		str1 = str1 + str2;
		StringBuffer sb = new StringBuffer();
		sb.append(str1);
		sb.append(str2);
		sb.append(10);
		// 10을 오버라이딩 했다
		// 참조변수는 tostring을 자동호출한다.
		
		
		String result = sb.toString();
//		System.out.println("num1"+1+"num2"+2);
		//num1스트링객체 1객체 num2객체 2객체
		System.out.println(result);
		
		
		
	}

}
