package year2022.month05.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 평균은 넘겠지
public class Baekjoon_04344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			
			int num[] = new int[N];
			int sum = 0;
			int cnt = 0;
			for(int i = 0; i<N; i++) {
				num[i] =  Integer.parseInt(st.nextToken());
				sum += num[i];
			}
			
			long avg = (long) sum / N; 
			
			for(int i = 0; i<N; i++) {
				if(num[i] > avg) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n", ( (float) cnt * 100 /N ));
		}

	}

}
