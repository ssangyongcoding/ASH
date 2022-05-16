package year2022.month05.day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 분수찾기
public class Baekjoon_01193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int idx = 1;
		int next = 0;
		
		while(true) {
			
			next += idx;
			
			if( next >= X) break;
			
			sum = next;
			idx++;
			
		}
		if(idx %2 == 1) {
			int x = idx - (X - sum - 1);
			System.out.println(x + "/" + (idx - x+ 1));
			
		}else {
			int y = idx - (X - sum - 1);
			System.out.println((idx - y + 1) + "/" + y);
			
		}
		

	}

}
