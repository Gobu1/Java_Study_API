package com.iu.iu.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead 
{
	public void read() throws IOException
	{	//파일의 내용 읽어 오기
		//1. 어느 폴더이 어느파일
		File file = new File("C:\\study", "test.txt");
		//2. 파일과 연결
		FileReader fr = new FileReader(file);
		//3. 파일의 내용 읽기
//		fr.read(); 한글자
		BufferedReader br = new BufferedReader(fr);
		//4. 내용 읽기
		boolean check = true;
		while(check){
			String name = br.readLine();//엔터키를 만날때까지
			if(name==null)
				break;
			System.out.println(name);
		}
		
		
	}

}
