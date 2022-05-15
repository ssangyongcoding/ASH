package year2022.month05.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 한수
public class Baekjoon_01065 {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N =Integer.parseInt(br.readLine());
		int cnt = 99;
		
		if( N < 100) {
			
			System.out.println(N);
			
		}else {
			for(int i = 100; i<=N; i++) {
				
				if(check(i)) cnt++;
			}
			
			System.out.println(cnt);
		}

	}

	private static boolean check(int num) {
		// TODO Auto-generated method stub
//		
//		if(num == 1000) return false;
//		
//		int first = num / 100;
//		
//		int second = (num / 10) % 10;
//		
//		int third = (num % 10);
//		
//		if((first - second) == (second - third)) return true;
//		
		
		String s = String.valueOf(num);
		int gap = 100;
		for(int i = 1, size = s.length(); i<size; i++) {
			
			int first = s.charAt(i-1) - '0';
			int second = s.charAt(i) - '0';
			
			if(gap == 100) {
				gap = first - second;
			}else {
				if(gap != (first - second)) return false;
			}
		}
		return true;
		
	}

}
