package com.iu.iu.file.ex1;

import java.util.ArrayList;

public interface Service 
{
	//StudentDAO에서 getList를 호출하여 총점과 평균을 각각 계산하여 대입 그 List를 리턴
	public ArrayList<StudentDTO> getList()throws Exception;

	//StudentDAO의 setList를 호출하고 그 결과를 리턴
	public int setList(ArrayList<StudentDTO> ar)throws Exception;
	
	//찾으려하는 학생의 번호를 입력받아서 찾은 학생을 리턴해준다
	public StudentDTO getStudent(ArrayList<StudentDTO> ar)throws Exception;
	
	//삭제하려는 학생의 번호를 입력받아서 일치하는 학생을 삭제
	//삭제가 성공하면 1을리턴 실패하면 0을리턴
	public int setStudentDelete(ArrayList<StudentDTO> ar)throws Exception; 
	
	//학생 한몀을 추가
	public void setStudentAdd(ArrayList<StudentDTO> ar)throws Exception;
	
	
}
