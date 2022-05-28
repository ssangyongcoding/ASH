package year2022.month05.day31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 팩토리얼
public class Baekjoon_10872 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(fact(N));

	}

	private static int fact(int n) {
		
		if(n == 1 || n == 0) {
			return 1;
		}
		
		return n * fact(n-1);
		
	}

}
