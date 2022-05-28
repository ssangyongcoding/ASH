package year2022.month05.day31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 덩치
public class Baekjoon_07568 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] W = new int[N];
		int[] H = new int[N];
		int[] rank = new int[N];

		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int idx = 0;

		while (N > idx) {

			st = new StringTokenizer(br.readLine(), " ");

			W[idx] = Integer.parseInt(st.nextToken());
			H[idx] = Integer.parseInt(st.nextToken());
			rank[idx++] = 1;
		}

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (W[i] > W[j] && H[i] > H[j]) {
					rank[j]++;
				} else if (W[i] < W[j] && H[i] < H[j]) {
					rank[i]++;
				}

			}
			sb.append(rank[i]).append(" ");

		}
		System.out.println(sb.toString());

	}

}
