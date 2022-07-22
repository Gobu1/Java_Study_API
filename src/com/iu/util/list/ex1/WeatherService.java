package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService 
{
	private StringBuffer sb;
	private Scanner sc;
	
	public WeatherService() 
	{
		sc = new Scanner(System.in);
		sb = new StringBuffer(); //sb는 스트링타입이 아니다.
		sb.append("Seoul,30.2,70,맑음,");
		sb.append("Daegu-38.9-90-흐림-");
		sb.append("Jeju,12.1,10,눈,");
		sb.append("Busan-0.5,85,태풍");
	}
	
	public void init(ArrayList<CityDTO> ar)  //전산용어 - init는 대부분 초기화
	
	{
		String data = sb.toString();
		data=data.replace("-", ",");
		StringTokenizer st = new StringTokenizer(data, ",");
		
		while(st.hasMoreTokens())
		{
			CityDTO cityDTO = new CityDTO();
			cityDTO.setName(st.nextToken());
			cityDTO.setGion(Double.parseDouble(st.nextToken()));
			cityDTO.setHum(Integer.parseInt(st.nextToken()));
			cityDTO.setStatus(st.nextToken());
			ar.add(cityDTO);
		}
		
		
		
	}
	
	public boolean add(ArrayList<CityDTO> ar)
	{
		CityDTO cityDTO = new CityDTO();
		System.out.println("도시명 입력");
		cityDTO.setName(sc.next());
		System.out.println("기온 입력");
		cityDTO.setGion(sc.nextDouble());
		System.out.println("습도 입력");
		cityDTO.setHum(sc.nextInt());
		System.out.println("날씨 입력");
		cityDTO.setStatus(sc.next());
		return ar.add(cityDTO);
		
	}
	
	public void remove(ArrayList<CityDTO> ar) 
	{
		System.out.println("삭제 하려는 도시명 입력");
		String name = sc.next();
		
		//전통 for
//		for(int i=0;i<ar.size();i++) {
//			if(name.equals(ar.get(i).getName())) {
//				ar.remove(i);
//				break;
//			}
//		}
		
		//향상된 for
		for(CityDTO cityDTO: ar) //ar에서 cityDTO로 주소값이 들어간다
		{
			if(name.equals(cityDTO.getName())) 
			{
				ar.remove(cityDTO);
				break;
			}
		}
//
	}
	public CityDTO find(ArrayList<CityDTO> ar)
	{
		CityDTO cityDTO=null;
		System.out.println("도시명 입력");
		String name = sc.next();
		for(CityDTO cityDTO1 : ar)
		{
			if(name.equals(cityDTO1.getName()))
			{
				cityDTO = cityDTO1;
				break;
			}
		}
		
		return cityDTO;
	}
	
	
	
}


	