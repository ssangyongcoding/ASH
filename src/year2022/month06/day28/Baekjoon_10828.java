package year2022.month06.day28;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
//10828 스택
public class Baekjoon_10828 {

	static final int MAX = 10000;
	static int top;
	
	static int stack[] = new int[MAX];
	
	static void Init() {
		top = 0;
	}
	
	static int isEmpty() {
		if(top == 0)
			return 1;
		else 
			return 0;
	}
	
	static void push(int value) {
		
		stack[top++] = value;
	}
	
	static Integer pop() {
		if(top == 0) {
			
			return -1;
		}
		int temp = stack[top-1];
		stack[top--] = 0;
		
		return temp;
	}
	
	static int top() {
		if(top == 0) {
			
			return -1;
		}
		return stack[top-1];
	}
	
	static Integer size() {
		return top;
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		Init();
		StringBuilder sb = new StringBuilder();
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			String s= st.nextToken();
			
			if(s.equals("push")) {
				int n = Integer.parseInt(st.nextToken());
				push(n);
			}
			else if(s.equals("pop")) {
				sb.append(pop() +"\n");
			}
			else if(s.equals("size")) {
				sb.append(size() +"\n");
			}
			else if(s.equals("empty")) {
				sb.append(isEmpty() +"\n");
			}
			else if(s.equals("top")) {
				sb.append(top() +"\n");
			}
			
		}
		bw.write(sb.toString());
		bw.close();
		br.close();
	}

}
