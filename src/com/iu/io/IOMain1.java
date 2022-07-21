package com.iu.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain1
{

	public static void main(String[] args)
	{
		//키보드로부터 글자를 입력받는 순서 작성
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);//한글자
		BufferedReader br = new BufferedReader(ir);
		try {
			String msg = br.readLine();
			System.out.println(msg);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
