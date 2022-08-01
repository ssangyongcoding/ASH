package year2022.month08.day02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 01타일
public class Baekjoon_01904 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num[] = new int[1000001];
		num[0] = 0;
		num[1] = 1;
		num[2] = 2;
		for (int i = 3; i < 1000001; i++) {
			num[i] = num[i - 1] + num[i - 2];
			num[i] = num[i] % 15746;
		}
		int N = Integer.parseInt(br.readLine());

		bw.write((num[N] % 15746) + "");
		br.close();
		bw.close();
	}

}
