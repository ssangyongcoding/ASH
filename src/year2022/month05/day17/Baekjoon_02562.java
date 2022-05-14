package year2022.month05.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// 최댓값
public class Baekjoon_02562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int max = 0;
		
		for(int i= 1; i<10; i++) {
			
			int num = Integer.parseInt(br.readLine());
			
			map.put(num, i);
			
			max = Math.max(num, max);
			
		}
		
		System.out.printf("%d\n%d", max, map.get(max));

	}

}
