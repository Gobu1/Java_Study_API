package com.iu.util.list;

import java.util.ArrayList;

public class ListMain
{

	public static void main(String[] args) 
	{
		//1,2,3
		int []nums = new int[3];
		nums[0] =1;
		
		//1. List -> ArrayList
		ArrayList ar = new ArrayList(); //칸 선언 따로안함
		ar.add(1); //primitive타입을 담을수없다. reference타입만 담을수잇다
					//이경우 reference로 auto boxing
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(1,"abc"); //1번 인덱스에 삽입 (기존1번은 밀림)
		ListView listView = new ListView();
		listView.view(ar);
		//remove - 특정 인덱스 element를 삭제
		ar.remove(2);
		ar.remove("abc");
		listView.view(ar);
		
		//set - 특정 인덱스 번호의 요소를 수정
		ar.set(1, "c");
		listView.view(ar);
		
		//clear - 모든 요소를 삭제
		ar.clear();
		listView.view(ar);
		
	}

}
