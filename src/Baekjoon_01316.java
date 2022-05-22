

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//그룹 단어 체커
public class Baekjoon_01316 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		int cnt = 0;

		while (T-- > 0) {

			String s = br.readLine();

			boolean[] alphabet = new boolean[26];
			boolean chk = true;

			for (int i = 0, size = s.length(); i < size; i++) {
				int idx = s.charAt(i) - 'a';
				if (alphabet[idx]) {
					if (s.charAt(i - 1) != s.charAt(i)) {
						chk = false;
						break;
					}

				} else {
					alphabet[idx] = true;
				}

			}

			if (chk)
				cnt++;

		}
		System.out.println(cnt);

	}

}
