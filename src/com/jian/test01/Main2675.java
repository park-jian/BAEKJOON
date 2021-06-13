package com.jian.test01;


import java.util.Scanner;

public class Main2675 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		
		 	
		//테스트코드 개수만큼 돌아가는 for문
		for(int i=0; i < T; i++) {
			
			//단어를 몇번 반복할건지
			int R = sc.nextInt(); 
			String p = "";
			//문자열을 char로 쪼개서 st라는 배열에 저장.
			 String[] st = sc.next().split(""); 
			 for(int q=0; q < st.length; q++) {
				 for(int x=0; x<R; x++) {
					 
					 p += st[q];
				 }
			 }
			 System.out.println(p);
		}
		sc.close();
	}

}
