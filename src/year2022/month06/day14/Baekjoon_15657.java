package year2022.month06.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//N과 M (8)
public class Baekjoon_15657 {
	static int N = 0, M = 0;
	static int pick[];
	static int num[];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		pick = new int[M];
		num = new int[N];

		st = new StringTokenizer(br.readLine(), " ");

		int index = 0;

		while (st.hasMoreElements()) {
			num[index++] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);

		nm(0, 0);

		System.out.println(sb.toString());

	}

	private static void nm(int idx, int next) {
		// TODO Auto-generated method stub
		if (idx == M) {
			for (int i = 0; i < M; i++) {
				sb.append(pick[i]).append(" ");
			}
			sb.append("\n");

			return;
		}

		for (int i = next; i < N; i++) {
			pick[idx] = num[i];
			nm(idx + 1, i);
		}

	}

}
