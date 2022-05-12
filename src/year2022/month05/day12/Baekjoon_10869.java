package year2022.month05.day12;

import java.util.Scanner;

public class Baekjoon_10869 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.printf("%d\n%d\n%d\n%d\n%d\n"
				, A + B
				, A - B
				, A * B
				, A / B
				, A % B);
		
		
	}

}
