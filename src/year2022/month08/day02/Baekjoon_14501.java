package year2022.month08.day02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 퇴사
public class Baekjoon_14501 {
	static int N;
	static int T[], P[], dp[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 위해 br 객체 생성
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력을 위해 bw 객체 생성

		N = Integer.parseInt(br.readLine());

		T = new int[15];
		P = new int[15];
		dp = new int[15];
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			T[i] = Integer.parseInt(st.nextToken());
			P[i] = Integer.parseInt(st.nextToken());
			dp[i] = -1;
		}

		bw.write(solve(0) + "");
		bw.close(); // 출력 종료
		br.close(); // 입력 종료
	}

	private static int solve(int day) {
		// TODO Auto-generated method stub
		
		if(day > N) return -98765431;
		
		if(day == N) return 0;
		
		int ret = dp[day];
		
		if(ret != -1) return ret;
		
		ret = Math.max(solve(day + 1 ), solve(day + T[day]) + P[day]);
		return ret;
		
	}

}
