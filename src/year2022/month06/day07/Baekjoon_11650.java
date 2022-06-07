package year2022.month06.day07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

// 좌표 정렬하기
public class Baekjoon_11650 {
	static class Location {
		int x;
		int y;

		public Location() {
			
		}

		public Location(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Location> list = new ArrayList<Location>();
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			Location xy = new Location(x, y);
			list.add(xy);
		}
		
		Collections.sort(list, new Comparator<Location>() {

			@Override
			public int compare(Location l1, Location l2) {
				// TODO Auto-generated method stub
				if (l1.x > l2.x) {
					return 1; 
				} 
				else if (l1.x == l2.x) {
					if (l1.y > l2.y) { 
						return 1;
					}
				}
				return -1;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			
			int x = list.get(i).x;
			int y = list.get(i).y;

			sb.append(x + " " + y).append("\n");
			
		}
		
		System.out.println(sb.toString());
		
	}

}
