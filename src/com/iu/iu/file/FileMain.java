package com.iu.iu.file;

import java.io.File;

public class FileMain 
{

	public static void main(String[] args) 
	{	//File : 파일이나 폴더의 정보를 담는 클래스, 실제 파일이나 폴더가 없을수도있다.
		File file = new File("C:\\study");
		//parent : 폴더, chile : 파일명 또는 최종 폴더명
		file = new File("C:\\study","test.txt");
		
		// 1. 폴더명 경로가 있는 File 객체 이용
		File path = new File("C:\\study");
		file = new File(path, "test.txt");
		
		
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.length());
		
		
		System.out.println("=============");
		System.out.println(path.exists());
		System.out.println(path.isFile());
		System.out.println(path.isDirectory());
		
		file = new File("C:\\study\\sub");
		if(!file.exists()) {
			file.mkdir();
		}
		File file2 = new File("C:\\study\\sub2\\t1");
//		file.mkdir(); - 중간에 폴더가 없으면 생성이 안된다
		file2.mkdirs();
//		file.delete();

		File file3 = new File("C:\\study\\sub2\\test.txt");
		file3.mkdir();
		
//		file2.delete();
//		file3.delete();
		
		
	}

}
