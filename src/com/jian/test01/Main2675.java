package com.jian.test01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2675 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		int R=0;
		String[] s;
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i=0; i < T; i++) {
			R = sc.nextInt();
			s= sc.next().split("");
			for(int m=0; m < s.length; m++) {
				for(int n=0; n < R; n++) {
					System.out.print(s[m]);
				}
				
			}
			
		}
		
		for(int j=0; j <T; j++) {
			
		}
		
		sc.close();
	}

}
