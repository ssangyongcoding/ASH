package year2022.month06.day07;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

// 듣보잡
public class Baekjoon_01764 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashSet<String> set = new HashSet<>();
		ArrayList<String> list = new ArrayList<>();
		
		while(N-- > 0) {
			
			set.add(br.readLine());
			
		}

		while(M-- > 0) {
			
			String s = br.readLine();
			
			if(set.contains(s)) {
				list.add(s);
			}
			
		}
		
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		sb.append(list.size()).append("\n");
		
		for(int i = 0, size = list.size(); i<size; i++) {
			sb.append(list.get(i)).append("\n");
		}
		
		System.out.println(sb.toString());
		
	}

}
