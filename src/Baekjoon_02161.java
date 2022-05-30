import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
// 카드1
public class Baekjoon_02161 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 1; i<=N; i++) {
			q.add(i);
		}
		
		boolean flag = true;
		
		while(!q.isEmpty()) {
		
			int num = q.poll();
			
			if(flag) {
				flag = false;
				sb.append(num).append(" ");
			}
			else {
				flag = true;
				q.add(num);
			}
			
		}
		System.out.println(sb.toString());
		

	}

}
