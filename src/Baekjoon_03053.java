import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 택시 기하학
public class Baekjoon_03053 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.printf("%.6f\n", Math.PI * N * N );
		System.out.printf("%.6f", (double)2 * N * N );

	}

}
