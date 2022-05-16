package year2022.month05.day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 단어의 개수
public class Baekjoon_01152 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int cnt = 0;
		while(st.hasMoreElements()) {
			st.nextToken();
			cnt++;
		}
		
		System.out.println(cnt);
		

	}

}
