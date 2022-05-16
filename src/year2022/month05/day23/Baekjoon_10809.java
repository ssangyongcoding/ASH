package year2022.month05.day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

//알파벳 찾기
public class Baekjoon_10809 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0, size = s.length();i <size; i++) {
			int idx = s.charAt(i) - 'a';
			
			if(!map.containsKey(idx)) map.put(idx, i);
			
		}
		
		for(int i = 0; i<26; i++) {
			
			if(map.containsKey(i)) {
				sb.append(map.get(i)).append(" ");
			}
			else {
				sb.append("-1 ");
			}
			
		}
		
		System.out.println(sb.toString());
		
	}

}
