package com.jian.test01;

import java.util.Arrays;
import java.util.Scanner;

public class Main2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[9];
		
		int checkNum = 0;
		//값 입력
		for(int i=0; i<9; i++) {
			nums[i] =sc.nextInt();
			
		}
		//배열의 깊은 복사.
		int[] numsCopy = nums.clone();
		
		//오름차순 정렬
		Arrays.sort(nums);
		
		//현재 nums[8]가 최댓값
		System.out.println(nums[8]);
		for(int i: numsCopy) {
			checkNum++;
			if(i == nums[8]) {
				System.out.println(checkNum);
				break;
			}
		}

	}

}
