package com.jian.test01;

import java.util.Scanner;

public class Main8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int j=0; j < num; j++) {
			String[] charArray = sc.next().split("");
			int count = 0;
			int sum = 0;
			for(int i=0; i < charArray.length; i++) {
				if(charArray[i].equals("O") || charArray[i].equals("o")) {
					count++;
					sum += count;
				}else {
					count = 0;
				}
			}
			
			System.out.println(sum);
		}
		
		sc.close();
	}

}
