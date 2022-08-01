package year2022.month08.day02;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// RGB거리
public class Baekjoon_01149 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int RGB[][] = new int[N][3];
		int minMoney[][] = new int[N][3];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 3; j++) {
				RGB[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		minMoney[0][0] = RGB[0][0];
		minMoney[0][1] = RGB[0][1];
		minMoney[0][2] = RGB[0][2];

		for (int i = 1; i < N; i++) {
			minMoney[i][0] = Math.min(minMoney[i - 1][1], minMoney[i - 1][2]) + RGB[i][0];
			minMoney[i][1] = Math.min(minMoney[i - 1][0], minMoney[i - 1][2]) + RGB[i][1];
			minMoney[i][2] = Math.min(minMoney[i - 1][0], minMoney[i - 1][1]) + RGB[i][2];
		}

		int result = Integer.MAX_VALUE;

		for (int i = 0; i < 3; i++) {
			if (result > minMoney[N - 1][i])
				result = minMoney[N - 1][i];
		}

		bw.write(result + "");
		br.close();
		bw.close();
	}

}
