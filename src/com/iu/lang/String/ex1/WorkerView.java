package com.iu.lang.String.ex1;

public class WorkerView 
{
	public void view(WorkerDTO [] workerDTOs)
	{
		for(WorkerDTO workerDTO:workerDTOs)
		{
			System.out.println("이름 :"+workerDTO.getName());
			System.out.println("부서 :"+workerDTO.getDepartment());
			System.out.println("직책 :"+workerDTO.getJob());
			System.out.println("번호 :"+workerDTO.getPhone());
		}
		
	}
}
