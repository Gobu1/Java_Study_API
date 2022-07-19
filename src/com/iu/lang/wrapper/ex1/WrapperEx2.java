package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx2 
{
	//juminCheck
	//주민번호를 입력받는다 === 9  7  1  1  2  4  -  1  2  3  4  5  6  7 (체크번호)
	//				*	  2  3  4  5  6  7  -  8  9  2  3  4  5  
	//					 18 21  4  5 12  28	   8  18 6  12 20 30 
	//					총합 = 192
	//총합을 11로 나누어서 나머지를 구한다.  ==> 192/11 = 17//5
	//그 나머지를 11에서 뺀다. 그 결과 마지막 체크용 번호와 비교
	//연산 결과가 두자리라면 10, 11이라면 연산결과를 다시 10으로 나눈 나머지와 체크용 번호를 비교
	Scanner sc = new Scanner(System.in);
	
	public void juminCheck()
	{
		System.out.println("주민등록번호를 입력하세요");
		String jumin = sc.next();
		if(jumin.length() != 14) 
		{
			System.out.println("입력 오류");
			return;
		}
		jumin=jumin.replace("-", "");
		String []jumin1 = jumin.split("");
		
		int [] check = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		int total = 0;
		for(int i=0; i<check.length;i++)
		{
			total = total + check[i]*Integer.parseInt(jumin1[i]); 
		}
		int check2 = total%11;
		String lastnum = jumin.substring(12,13);
		if (11-check2==Integer.parseInt(lastnum))
			System.out.println("적법한 주민등록번호입니다.");
		else if(1==(11-check2)%10)
				System.out.println("적법한 주민등록번호입니다.");
		else
			System.out.println("적법하지 않은 주민등록번호입니다.");
	}
	
	
	
}
