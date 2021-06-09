package com.jian.test01;

import java.util.Scanner;

public class Main10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		
		// 'a'에 대한 아스키 코드 값이 97이다.
		//아래처럼 s.indexof(97)이나 s.indexof('a') 하나 결국 동일하게 'a'의 index값을 리턴한다.
		
		//a~z까지 총 26개 존재
		int[] countCha = new int[26];
		for(int i=0; i < 26; i++) {
			countCha[i] = s.indexOf(97+i);
			System.out.print(countCha[i]+" ");
		}
		
		sc.close();

	}

}
