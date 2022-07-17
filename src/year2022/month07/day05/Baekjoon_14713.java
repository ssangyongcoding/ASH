package year2022.month07.day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
// 앵무새
public class Baekjoon_14713 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Queue<String> q[] = new LinkedList[N];

		for (int i = 0; i < N; i++) {
			q[i] = new LinkedList<>();
			st = new StringTokenizer(br.readLine(), " ");
			while (st.hasMoreTokens()) {
				q[i].add(st.nextToken());
			}
		}

		st = new StringTokenizer(br.readLine(), " ");
		boolean result = true;
		String s;
		while (st.hasMoreTokens()) {
			boolean flag = false;

			s = st.nextToken();

			for (int i = 0; i < N; i++) {
				if (q[i].isEmpty())
					continue;
				if (!q[i].peek().equals(s))
					continue;
				q[i].poll();
				flag = true;
				break;
			}

			if (!flag) {
				result = false;
				break;
			}

		}

		for (int i = 0; i < N; i++) {
			if (!q[i].isEmpty()) {
				result = false;
			}
		}

		if (result)
			System.out.println("Possible");
		else
			System.out.println("Impossible");

	}

}
