import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 나는야 포켓몬 마스터 이다솜
public class Baekjoon_01620 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int idx = 1;
		
		HashMap<String, String> map = new HashMap<>();
		
		while(N-- > 0) {
			
			String s = br.readLine();
			String index = String.valueOf(idx++);
			
			map.put(s, index);
			map.put(index, s);
			
		}
		
		while(M-- > 0) {
			
			String s = br.readLine();
			
			sb.append(map.get(s)).append("\n");
			
			
		}
		System.out.println(sb.toString());
	}

}
