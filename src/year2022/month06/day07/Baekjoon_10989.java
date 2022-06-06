package year2022.month06.day07;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 수 정렬하기 3
public class Baekjoon_10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int arr[] = new int[10001];
		
		while(N-- > 0) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		for(int i = 1; i<=10000; i++) {
			int cnt = arr[i];
			for(int j = 0; j<cnt; j++) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb.toString());

	}

}
