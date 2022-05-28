package year2022.month05.day31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 블랙잭
public class Baekjoon_02798 {
	static int[] arr;
	static int N, M, max;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),  " ");
		
		N  = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		max = 0;
		
		arr = new int[N];
		
		st = new StringTokenizer(br.readLine(),  " ");
		int idx = 0;
		
		while(st.hasMoreElements()) {
			arr[idx++] = Integer.parseInt(st.nextToken());
		}
		
		pick(0, 0, 0);
		
		System.out.println(max);

	}

	private static void pick(int num, int sum, int index) {
		if(num == 3) {
			max = (sum > max && sum <= M ) ?sum :max ;
			
			return;
		}
		
		for(int i = index; i<N; i++) {
			pick (num + 1, sum + arr[i], i + 1);
		}
		
	}

}
