package year2022.month07.day26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 동전 0
public class Baekjoon_11047 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[] m = new int[N];

		for (int i = 0; i < N; i++) {
			m[i] = Integer.parseInt(br.readLine());
		}

		int cnt = 0;
		for (int i = N; i > 0; i--) {
			int tp = K / m[i - 1];
			cnt += tp;

			K = K % m[i - 1];

		}
		System.out.println(cnt);

	}

}
