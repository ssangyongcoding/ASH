package year2022.month06.day07;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

// 서로 다른 부분 문자열의 개수
public class Baekjoon_11478 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> set = new HashSet<>();
		
		String s = br.readLine(); 
		
		for(int len = 1, size= s.length(); len<=size; len++) {
			
			for(int idx = 0; idx<=size - len; idx++) {
				set.add(s.substring(idx, idx+len));
			}
		}
		
		System.out.println(set.size());
		
	}

}
