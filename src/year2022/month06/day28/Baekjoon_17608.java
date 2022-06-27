package year2022.month06.day28;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 막대기
public class Baekjoon_17608 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<>();
		st.add(0);
		while(N-- > 0) {
			
			int num = Integer.parseInt(br.readLine());
			
			st.add(num);
			
		}
		
		int now = 0;
		int cnt = 0;
		while(!st.isEmpty()) {
			int num = st.pop();
			
			if(num > now) {
				
				now = num;
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
