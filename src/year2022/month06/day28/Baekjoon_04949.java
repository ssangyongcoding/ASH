package year2022.month06.day28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
// 균형잡힌 세상
public class Baekjoon_04949 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			String s = br.readLine();
			boolean chk = true;
			Stack<Integer> st = new Stack<>();
			if (s.length() == 1 && s.charAt(0) == '.')
				break;
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);

				if (c == '[') {
					st.add(1);
				} else if (c == ']') {
					if (st.empty() || st.peek() != 1) {

						chk = false;
						break;
					}
					else
						st.pop();
				} else if (c == '(') {
					st.add(2);

				} else if (c == ')') {
					if (st.empty() || st.peek() != 2 ) {

						chk = false;
						break;
					}
					else
						st.pop();

				} else
					continue;

			}

			if (st.size() > 0)
				chk = false;

			if (chk) {
				sb.append("yes\n");
			} else {
				sb.append("no\n");
			}
		}
		
		System.out.println(sb.toString());

	}

}
