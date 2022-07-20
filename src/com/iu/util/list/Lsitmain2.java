package com.iu.util.list;

import java.util.ArrayList;

public class Lsitmain2 
{

	public static void main(String[] args)
	{
		//
		ListView lv = new ListView();
		ArrayList/*<Integer>*/ ar = new ArrayList<>();
				//E(Elements) 인티저, 캐릭터등 레퍼런스타입 
		ar.add("first");
		ar.add(2); //Integer auto boxing
		ar.add('c'); //Character auto boxing
		ar.add(2.123);//Double auto boxing
		ar.add(null);//reference 타입
		lv.view(ar);
		
		//get -> 특정 인덱스 요소를 반환
		//형변환은 primitive 타입끼리, 다형성은 부모자식
		String n1 = (String)ar.get(0);
		int n2 = (int/*Integer*/)ar.get(1);
		char n3 = (char/*Character*/)ar.get(2);
		System.out.println(n3);
		
		System.out.println(ar.get(0) instanceof String);
		
		
	}

}
