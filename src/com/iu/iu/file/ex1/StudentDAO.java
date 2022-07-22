package com.iu.iu.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO 
{
	//DAO : Data Access Object
	//file data에 접근
	
	//1. getlist
	//	파일의 내용을 읽어서 작업 어레이리스트로 만들어서 리턴
	
	//2. setlist
	//예외처리는 내부에서 처리
	//List로 받은 데이터들을 studentData에다가 작성
	//기존에 내용은 삭제
	//작성 형식은 기존 내용의 형식과 동일
	//1을 리턴할시 정상적인 성공
	//0을 리턴할시 예외가 발생했을 경우
	

	public ArrayList<StudentDTO> getList2() throws Exception
	{
		ArrayList<StudentDTO> ar = new ArrayList<>();
		File file = new File("C:\\study\\studentData.txt");

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		boolean check=true;
		//첫줄 공백 제거
		br.readLine();
		while(check) { //While 시작
			String data=br.readLine();
			if(data==null) {
				break;
			}
			StringTokenizer st = new StringTokenizer(data, ",");
			while(st.hasMoreTokens()) {
				StudentDTO studentDTO = new StudentDTO();
				studentDTO.setName(st.nextToken().trim());
				studentDTO.setNum(Integer.parseInt(st.nextToken().trim()));
				studentDTO.setKor(Integer.parseInt(st.nextToken().trim()));
				studentDTO.setEng(Integer.parseInt(st.nextToken().trim()));
				studentDTO.setMath(Integer.parseInt(st.nextToken().trim()));
				ar.add(studentDTO);
			}
		}
		
		return ar;
	}
	
	public int setList(ArrayList<StudentDTO> ar)
	{
		File file = new File("C:\\Study","studentData1.txt");
		int result=1;
		try {
			FileWriter fw = new FileWriter(file);
			for(int i=0; i<ar.size(); i++)
			{
				StudentDTO studentDTO = ar.get(i);
				fw.write(studentDTO.getName()+"\r\n");
				fw.write(studentDTO.getNum()+"\r\n");
				fw.write(studentDTO.getKor()+"\r\n");
				fw.write(studentDTO.getMath()+"\r\n");
				fw.write(studentDTO.getEng()+"\r\n");
			}
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
			result=0;
		}
		
		System.out.println(result);
		return result;
		
	}	
	

	
		
//	public void view (StudentDTO studentDTO)
//	{
//		System.out.println(studentDTO.getName());
//		System.out.println(studentDTO.getNum());
//		System.out.println(studentDTO.getKor());
//		System.out.println(studentDTO.getMath());
//		System.out.println(studentDTO.getEng());
//	}
//	public void view(ArrayList<StudentDTO> ar)
//	{
//		for(int i=0; i<ar.size(); i++)
//		{
//			StudentDTO studentDTO=ar.get(i);
//			this.view(studentDTO);
//		}
//	}
	}
		
	
	
	
	
	
}

