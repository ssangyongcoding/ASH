import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 11월 11일
public class Baekjoon_25286 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		HashMap<Integer, Integer> days = new HashMap<>();

		days.put(1, 31);
		days.put(2, 28);
		days.put(3, 31);
		days.put(4, 30);
		days.put(5, 31);
		days.put(6, 30);
		days.put(7, 31);
		days.put(8, 31);
		days.put(9, 30);
		days.put(10, 31);
		days.put(11, 30);
		days.put(12, 31);
		
		while (N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int year = Integer.parseInt(st.nextToken());
			int month = Integer.parseInt(st.nextToken()) - 1;
			
			if(month == 0) {
				year--;
				month = 12;
			}
			
			int day = days.get(month);
			
			if((month == 2) && (year%4 == 0)) {
				
				if(year % 400 == 0) {
					day = 29;
				} else if(year % 100 == 0) {
					
				} else {
					day = 29;
				}
				
			}
		
			sb.append(year).append(" " ).append(month).append(" ").append(day).append("\n");

		}

		System.out.println(sb.toString());

	}

}
