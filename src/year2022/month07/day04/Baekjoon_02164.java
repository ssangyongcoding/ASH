package year2022.month07.day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
// 카드2
public class Baekjoon_02164 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int cnt=  0;
		Queue<Integer> q= new LinkedList<Integer>();
		
		for (int i = 0; i < N; i++) {
			q.add(i+1);
		}
		while(cnt++ < N-1) {
			q.poll();
			q.add(q.poll());
				
		}
		System.out.println(q.poll());

	}

}
