package year2022.month06.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// N과 M (2)
public class Baekjoon_15650 {
	static int N = 0, M = 0;
	static int pick[];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		 N = Integer.parseInt(st.nextToken());
		 M = Integer.parseInt(st.nextToken());
		 pick = new int[M];
		 
		 nm(0, 0, 1);
			System.out.println(sb.toString());

	}

	private static void nm(int idx, int flag, int st) {
		// TODO Auto-generated method stub
		

		if (idx == M) {
			for (int i = 0; i < M; i++) {
					sb.append(pick[i]).append(" ");
			}
			sb.append("\n");

			return;
		}

		for (int i = st; i <= N; i++) {
			if ((flag & (1 << i)) > 0)
				continue;
			pick[idx] = i;
			nm(idx + 1, flag | (1 << i), i+1);

		}

		
		
	}

}
