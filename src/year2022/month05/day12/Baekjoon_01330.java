package year2022.month05.day12;

import java.util.Scanner;

// 두 수 비교하기
public class Baekjoon_01330 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A > B) System.out.println(">");
		else if(A<B) System.out.println("<");
		else System.out.println("==");
		
	}

}
