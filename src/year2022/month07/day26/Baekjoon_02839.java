package year2022.month07.day26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 설탕배달
public class Baekjoon_02839 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int s5 = n / 5;
		int s3 = n / 3;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i <= s5; i++) {

			for (int j = 0; j <= s3; j++) {

				int total = 5 * i + 3 * j;

				if (total == n) {
					min = Math.min(min, i + j);
				}
			}

		}

		if (min == Integer.MAX_VALUE)
			bw.write("-1");
		else
			bw.write(min + "");

		bw.close();
		br.close();
	}

}
