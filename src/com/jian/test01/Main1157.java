package com.jian.test01;



import java.util.Scanner;


public class Main1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max=0;
		//문자열 대문자로 입력 받기
		String str = sc.next().toUpperCase();
		char maxStr=' ';
		System.out.println(str);
		int[] alphabet = new int[26];

		for(int i=0; i < str.length(); i++) {
					
			alphabet[str.charAt(i)-65]++;
			if(max < alphabet[str.charAt(i)-65]) {
				max = alphabet[str.charAt(i)-65];
				maxStr = str.charAt(i);
			}else if(max == alphabet[str.charAt(i)-65]) {
				maxStr = '?';
			}
				
			
		}		
		System.out.println(maxStr);
				sc.close();
	}
			
			
}
