package com.iu.util.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetMain2
{

	public static void main(String[] args) 
	{
		//랜덤
		Random random = new Random();
		HashSet<Integer> hashset = new HashSet<>();
		while(hashset.size()<6)
		{
			int num = random.nextInt(45)+1;
			hashset.add(num);
		}
		Iterator<Integer> it = hashset.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		
		
		
		
		
	}

}
