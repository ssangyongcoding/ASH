package year2022.month05.day31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 피보나치 수 5
public class Baekjoon_10870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		System.out.println(fibonacci(N));
		

	}

	private static int fibonacci(int n) {
		if(n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}else {
			return fibonacci(n-1) + fibonacci(n - 2);
		}
	}

}
