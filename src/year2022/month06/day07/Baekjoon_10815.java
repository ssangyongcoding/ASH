package year2022.month06.day07;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Baekjoon_10815 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		HashSet<String> set = new HashSet<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreElements()) {
			set.add(st.nextToken());
		}
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		while(st.hasMoreElements()) {
			if(set.contains(st.nextToken())) {
				sb.append("1 ");
			}
			else {

				sb.append("0 ");
			}
		}
		System.out.println(sb.toString());
	}

}
