package com.iu.lang.String.ex1;

public class WorkerService 
{
//	private String info;
	private StringBuffer sb;
	
	public WorkerService()
	{
		sb = new StringBuffer();
		sb.append("iu-인사과-과장-01011");
		sb.append(", suji-IT-대리-01022");
		sb.append(", choa-영업-부장-01033");
		sb.append(", hani-마케팅-사원-01044");
	}
	public WorkerDTO [] init()
	{	//이 메서드를 호출시 info에 데이터를 파싱하여 WorkerDTO에 대입
		//WorkerDTO를 모은 배열을 리턴
	
		String info = sb.toString();
		info = info.replace(", ", "-");
		String []info2 = info.split("-");
		WorkerDTO []workerDTOs= new WorkerDTO[info2.length/4];
		for(int i=0; i<info2.length; i=i+4)
		{
			WorkerDTO wd = new WorkerDTO();
			wd.setName(info2[i]);
			wd.setJob(info2[i+1]);
			wd.setDepartment(info2[i+2]);
			wd.setPhone(info2[i+3]);
			workerDTOs[i/4]=wd;
			
			
		}
		
		
		
		
		return workerDTOs;
	}
	
}
