package year2022.month05.day17;

import java.util.Scanner;

public class Baekjoon_01110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int now = sc.nextInt();
		int cnt = 0;
		int next = now;
		while(now != next || cnt == 0) {
			
			next = (next%10)*10 + ((next/10) + next%10 )%10;
			cnt++;
			
		}
		System.out.println(cnt);
	}

}
