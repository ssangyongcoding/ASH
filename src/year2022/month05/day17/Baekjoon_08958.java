package year2022.month05.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
// OX퀴즈
public class Baekjoon_08958 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			

			
			Stack<Character> st = new Stack<>();
			int sum = 0;
			
			String s = br.readLine();
			
			for(int i = 0, size = s.length() ; i<size; i++) {
				
				char c = s.charAt(i);
				if(c == 'O') {
					st.add('0');
					sum += st.size();
				}
				else {
					st.clear();
				}
			}
			
			sb.append(sum).append("\n");
			
		}
		
		System.out.println(sb.toString());

	}

}
