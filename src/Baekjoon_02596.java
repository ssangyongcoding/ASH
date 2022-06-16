import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Baekjoon_02596 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		HashMap<String, Character> map = new HashMap<>();
			
		map.put("000000", 'A');
		map.put("001111", 'B');
		map.put("010011", 'C');
		map.put("011100", 'D');
		map.put("100110", 'E');
		map.put("101001", 'F');
		map.put("110101", 'G');
		map.put("111010", 'H');
		
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		boolean flag = true;
		for(int i = 0; i<N; i++) {
			String temp = s.substring(i*6, (i+1)*6);
			System.out.println(temp);
			if(map.containsKey(temp)) {
				sb.append(map.get(temp));
			}
			else {
				flag = false;
				System.out.println(i+1);
				break;
			}
			
		}
		
		if(flag) {
			System.out.println(sb.toString());
		}

	}

}
