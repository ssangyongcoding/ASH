package year2022.month08.day09;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
// 근손실
public class Baekjoon_18429 {
	
	static int cnt = 0, N, K;
	static int muscle[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(),  " ");
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		muscle = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int idx = 0; idx< N; idx++) {
			muscle[idx] = Integer.parseInt(st.nextToken());
		}
		
		weight(0, 0, 500);
		
		System.out.println(cnt);
		bw.close();
		br.close();

	}

	private static void weight(int day, int flag,  int weight) {
		// TODO Auto-generated method stub
		if(day == N) {
			cnt++;
			return;
		}
		
		for(int idx = 0; idx< N; idx++) {
			if((flag & (1 << idx)) > 0) continue;
			int next = weight - K + muscle[idx];
			if(next >= 500) {
				weight(day + 1 , flag | (1 << idx), next );
			}
		}
		
		
	}

}
