package year2022.month07.day26;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 주유소
public class Baekjoon_13305 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int dest[] = new int[N];
		
		long left[] = new long[N];
		
		int gas[] = new int[N];
		
		int min = Integer.MAX_VALUE;
		
		long ans = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(),  " ");
		
		for(int i = 0; i<N-1; i++) {
			dest[i] = Integer.parseInt(st.nextToken());
		}
		left[N-2] = dest[N-2];

		for(int i = N-3; i>-1; i--) {
			left[i] = dest[i] + left[i+1];
		}
		st = new StringTokenizer(br.readLine(),  " ");

		for(int i = 0; i<N-1; i++) {
			gas[i] = Integer.parseInt(st.nextToken());
			min = Math.min(min, gas[i]);
		}

		for(int i = 0; i<N-1; i++) {
			int fuel = gas[i];
			
			if(fuel == min) {
				
				ans += fuel * left[i];
				break;
			}
			else {
				for(int j = i + 1; j<N-1; j++) {
					int next = gas[j];
					
					if(fuel > next) {
						ans += fuel * (left[i] - left[j]);
						i = j - 1;
						break;
					}
					
				}
			}
		}
		System.out.println(ans);

	}

}
