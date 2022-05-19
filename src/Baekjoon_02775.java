

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 부녀회장이 될테야
public class Baekjoon_02775 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		int[][] apt = new int[15][15];

		for (int floor = 0; floor <= 14; floor++) {
			for (int num = 1; num <= 14; num++) {
				if (floor == 0) {
					apt[floor][num] = num;
				} else {
					apt[floor][num] = apt[floor - 1][num] + apt[floor][num - 1];
				}

			}
		}

		while (T-- > 0) {

			int k = Integer.parseInt(br.readLine());

			int n = Integer.parseInt(br.readLine());

			sb.append(apt[k][n]).append("\n");
		}
		System.out.println(sb.toString());

	}

}
