import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 수열
public class Baekjoon_02559 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(),  " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] temp = new int[N];
		
		 st = new StringTokenizer(br.readLine(), " ");
		
		int sum = 0;
		int now = 0;
		int next = 0;
		int max = Integer.MIN_VALUE;
		
		while(st.hasMoreElements()) {
			temp[next] = Integer.parseInt(st.nextToken());
			sum += temp[next];
			
			if(next - now == K-1) {
				max = Math.max(sum, max);
				sum -= temp[now];
				now++;
			}
			next++;
		}
		
		System.out.println(max);
		
	}

}
