package year2022.month05.day12;

import java.util.Scanner;

// 주사위 세개
public class Baekjoon_02480 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int max = Math.max(A, Math.max(B, C));
		
		if(A == B && B == C) System.out.println(10000 + A * 1000);
		else if( A == B || A == C) System.out.println(1000 + A * 100);
		else if( B == C) System.out.println(1000 + B * 100);
		else System.out.println(max * 100);
		
	}

}
