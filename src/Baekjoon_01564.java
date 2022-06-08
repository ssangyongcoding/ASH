import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 팩토리얼 5
public class Baekjoon_01564 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		long ans = 1;
		
		int idx = 1;
		
		long number = 1000000000000L;
		
		while(N >= idx) {
			
			int now = idx++;
			
			ans *= now;
			
			while(ans%10 == 0) {
				ans /= 10;
			}
			
			ans %= (number);

			
		}
		
		System.out.println(String.format("%05d", ans%100000));
		
	}

}
