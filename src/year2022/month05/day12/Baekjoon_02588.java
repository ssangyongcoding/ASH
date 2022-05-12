package year2022.month05.day12;

import java.util.Scanner;

public class Baekjoon_02588 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.printf("%d\n%d\n%d\n%d\n", A * (B%10), A*((B/10)%10), A*(B/100) , A*B);
		
	}

}
