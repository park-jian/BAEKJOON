package com.jian.test01;

import java.util.Arrays;
import java.util.Scanner;

public class Main2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[9];
		
		int checkNum = 0;
		//�� �Է�
		for(int i=0; i<9; i++) {
			nums[i] =sc.nextInt();
			
		}
		//�迭�� ���� ����.
		int[] numsCopy = nums.clone();
		
		//�������� ����
		Arrays.sort(nums);
		
		//���� nums[8]�� �ִ�
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
