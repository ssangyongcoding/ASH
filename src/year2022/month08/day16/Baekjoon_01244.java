package year2022.month08.day16;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//스위치 켜고 끄기
public class Baekjoon_01244 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		boolean[] s = new boolean[N + 1];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i < N + 1; i++) {
			int temp = Integer.parseInt(st.nextToken());

			if (temp == 0) {
				s[i] = false;
			} else {
				s[i] = true;
			}

		}
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int student = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());

			if (student == 1) {
				for (int i = num; i < N + 1; i += num) {
					s[i] = (s[i]) ? false : true;
				}

			} else {
				int cnt = 0;
				while (true) {
					int left = num - cnt;
					int right = num + cnt;
					if (left < 1 || right > N)
						break;
					if (s[left] != s[right])
						break;
					s[left] = s[right] = (s[right]) ? false : true;
					cnt++;
				}

			}

		}

		for (int i = 1; i < N + 1; i++) {
			if (s[i]) {
				System.out.print(1 + " ");
			} else {
				System.out.print(0 + " ");
			}

			if (i % 20 == 0)
				System.out.println();

		}

	}

}
