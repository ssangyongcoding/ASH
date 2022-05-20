import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 앵그리 창영
public class Baekjoon_03034 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(),  " ");
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		
		int L = (int) Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2) );
		StringBuilder sb = new StringBuilder();
		while(N-- > 0) {
			st= new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			if(num > L) {
				System.out.println("NE");
			}else {
				System.out.println("DA");
			}
		}
		
		System.out.println(sb.toString());

	}

}
