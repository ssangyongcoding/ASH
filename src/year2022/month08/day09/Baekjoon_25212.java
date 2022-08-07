package year2022.month08.day09;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
// 조각 케이크
public class Baekjoon_25212 {
	static int N;
	static double piece[];
	static int cnt = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine()); // 전체 조각 케이크 수
		
		piece = new double[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(),  " ");
		
		for(int idx = 0; idx < N; idx++ ) {
			
			piece[idx] = 1/Double.parseDouble(st.nextToken());
		}
		
		for(int idx = 1; idx<=N; idx++) {
			cake(idx, 0,  0);
		}
		System.out.println(cnt);
		bw.close();
		br.close();

	}
	private static void cake(int choice, int index,double sum) {
		// TODO Auto-generated method stub
		
		if(choice == 0) {
			if(sum >= 0.99 && sum <= 1.01)  cnt++;
			
			return;
		}
		
		for(int idx = index; idx<N; idx++) {
			
			cake(choice - 1 , idx+1, sum + piece[idx]);
			
		}
		
	}


}
