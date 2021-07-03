package com.jian.test01;

import java.util.Arrays;
import java.util.Scanner;



public class Main1546 {


	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//시험 본 과목수
		//System.out.print("과목수:");
		int N = sc.nextInt();
		float arr[] =new float[N];
		
		float sum=0;
		//System.out.println("성적입력:");
		
		for(int i=0; i < N; i++ ) {
			//세준이 현재 성적받기
			arr[i] = sc.nextFloat();
			
		}
		
		
		//배열정렬
		Arrays.sort(arr);
	
		//최댓값
		//System.out.println(arr[arr.length-1]);
		
		//현재 성적 중 최댓값
		float M = arr[arr.length-1];
		//System.out.println(M);
	
		for(int i=0; i < N; i++ ) {
			//새로운 성적계산
			sum +=(arr[i]/M)*100;
			
		}
		//평균
		System.out.println(sum/N);
		
		//scanner 닫기
		sc.close();
	}

}
