package com.iu.iu.file.ex1;

import java.util.ArrayList;

public class StudentView 
{
	public void view(String message) 
	{
		System.out.println(message);
	}
	public void view (StudentDTO studentDTO)
	{
		System.out.println("이름 : "+studentDTO.getName());
		System.out.println("번호 : "+studentDTO.getNum());
		System.out.println("국어 : "+studentDTO.getKor());
		System.out.println("영어 : "+studentDTO.getMath());
		System.out.println("수학 : "+studentDTO.getEng());
		System.out.println("총점 : "+studentDTO.getTotal());
		System.out.println("평균 : "+studentDTO.getAvg());
	}
	public void view(ArrayList<StudentDTO> ar)
	{
		for(int i=0; i<ar.size(); i++)
		{
			StudentDTO studentDTO=ar.get(i);
			this.view(studentDTO);
		}
	}

}
