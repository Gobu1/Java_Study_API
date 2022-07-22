package com.iu.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOMain2 
{

	public static void main(String[] args) 
	{
//		Scanner sc = new Scanner(System.in);
//		//DDos
//		//Denial of Service
//		sc.close();
		
		//0,1신호 보내는 라이브러리
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("입력");
		
		try {
			String message = br.readLine();
			System.out.println(message);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//연결된 역순으로 자원을 해제
			try {
				br.close();
				ir.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
