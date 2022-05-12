package year2022.month05.day12;

import java.util.Scanner;

// 사분면 고르기 
public class Baekjoon_14681 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > 0) {
			if(y > 0) {
				System.out.println("1");
				
			}else {
				System.out.println("4");
			}
			
		}else {
			if(y > 0) {
				System.out.println("2");
			}else {
				System.out.println("3");
			}
			
		}

	}
}
