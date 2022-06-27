package year2022.month06.day28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
// 스택 수열
public class Baekjoon_01874 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		Stack<Integer> seq = new Stack<>(); // stack sequence
		Queue<Character> op = new LinkedList<>(); // save operators (push : +, pop : -)

		int max = 0; // max number of sequence (already in stack & popped)
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			if (max < num) { // num not pushed yet
				for (int j = max + 1; j < num; j++) { // why not j<= num? : real push & pop need time -> to save
					seq.push(j); // have to push [max + 1, num]
					sb.append("+\n");
				}
				sb.append("+\n"); // num pushed
				sb.append("-\n"); // and popped
				max = num;
			} else { // already in stack
				if (seq.peek() == num) { // can access directly
					seq.pop();
					sb.append("-\n");
				} else { // cannot recover upper data once popped -> fail
					System.out.println("NO\n");
					return;
				}
			}

		}

		System.out.println(sb.toString());

	}

}
