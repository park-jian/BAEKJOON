package com.jian.test01;

import java.util.Scanner;

public class Leet1108 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ip:");
		String ip = sc.next();
		
		
		System.out.println(ip.replace(".","[.]"));
		

	}

}
