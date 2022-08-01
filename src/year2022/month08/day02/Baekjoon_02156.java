package year2022.month08.day02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 01타일
public class Baekjoon_02156 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 위해 br 객체 생성
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력을 위해 bw 객체 생성

		int N = Integer.parseInt(br.readLine());
		int wine[] = new int[N + 1];
		int max[] = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			wine[i] = Integer.parseInt(br.readLine());
		}
		max[0] = 0;
		max[1] = wine[1];
		if (N > 1)
			max[2] = max[1] + wine[2];
		for (int i = 3; i <= N; i++) {
			max[i] = Math.max(Math.max(max[i - 1], wine[i] + wine[i - 1] + max[i - 3]), wine[i] + max[i - 2]);
		}

		bw.write(max[N] + "");
		bw.close(); // 출력 종료
		br.close(); // 입력 종료
	}

}
