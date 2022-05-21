import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

// 대칭 차집합
public class Baekjoon_01269 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		HashSet<String> set = new HashSet<>();

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int sum = A + B;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		while(st.hasMoreElements()) {
			set.add(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		
		while(st.hasMoreElements()) {
			if(set.contains(st.nextElement())) {
				sum -= 2;
			}
		}
		System.out.println(sum);

	}

}
