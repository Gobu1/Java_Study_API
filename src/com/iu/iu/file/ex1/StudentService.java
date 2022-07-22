package com.iu.iu.file.ex1;

import java.util.ArrayList;

public class StudentService implements Service
{
	StudentDAO sda;


	public ArrayList<StudentDTO> getList() throws Exception {
		ArrayList<StudentDTO> ar=sda.getList2();
		for(int i=0; i<ar.size(); i++)
		{
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getMath()+studentDTO.getEng());
			studentDTO.setAvg(studentDTO.getTotal()/3);
			ar.add(studentDTO);
		}
		
		return ar;
	}


	public int setList(ArrayList<StudentDTO> ar) throws Exception {
		
		return 0;
	}


	public StudentDTO getStudent(ArrayList<StudentDTO> ar) throws Exception {
		
		return null;
	}

	
	public int setStudentDelete(ArrayList<StudentDTO> ar) throws Exception {
		
		return 0;
	}

	
	public void setStudentAdd(ArrayList<StudentDTO> ar) throws Exception {
		
		
	}

}
