import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 알파벳 개수
public class Baekjoon_10808 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		
		int[] arr = new int[26];
		
		for(int i = 0, size = s.length(); i<size; i++ ) {
			
			arr[s.charAt(i) - 'a']++;
			
		}
		
		for(int i = 0; i<26; i++) {
			
			sb.append(arr[i]).append(" ");
			
		}
		System.out.println(sb.toString());

	}

}
