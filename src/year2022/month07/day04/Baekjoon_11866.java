package year2022.month07.day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
// 요세푸스 문제 0 
public class Baekjoon_11866 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),  " ");
		
		int N  =Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		ArrayList<Integer> arr = new ArrayList<>();
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 1; i < N + 1; i++) {
			q.add(i);
		}
		int del = 0;
		while (!q.isEmpty()) {
			int a = q.poll();
			del++;
			if (del == K) {
				del = 0;
				arr.add(a);
			} else {
				q.add(a);
			}
		}
		System.out.println(arr.toString().replace("[", "<").replace("]", ">"));

	}

}
