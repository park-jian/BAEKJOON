package com.jian.test01;

import java.util.Scanner;

public class Main10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		
		// 'a'�� ���� �ƽ�Ű �ڵ� ���� 97�̴�.
		//�Ʒ�ó�� s.indexof(97)�̳� s.indexof('a') �ϳ� �ᱹ �����ϰ� 'a'�� index���� �����Ѵ�.
		
		//a~z���� �� 26�� ����
		int[] countCha = new int[26];
		for(int i=0; i < 26; i++) {
			countCha[i] = s.indexOf(97+i);
			System.out.print(countCha[i]+" ");
		}
		
		sc.close();

	}

}
