import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Maximum Subarray
public class Baekjoon_10211 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		while(N-- > 0) {
			int max = Integer.MIN_VALUE;
			int T = Integer.parseInt(br.readLine());
			
			int[] num = new int[T];
			int[] dp = new int[T];
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			for(int i = 0; i<T; i++) {
				num[i] = Integer.parseInt(st.nextToken());
				if(i != 0) {
					dp[i] = Math.max(num[i] , dp[i-1] + num[i]);
				}
				else {
					dp[i] = num[i];
				}
				
				max = Math.max(max, dp[i]);
			}
			
			sb.append(max).append("\n");
			
		}
		System.out.println(sb.toString());

	}

}
