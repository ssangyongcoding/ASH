package year2022.month07.day12;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;


public class Baekjoon_02468 {
	static class Information {
		int x;
		int y;
		int h;

		public Information() {
		}

		public Information(int x, int y, int h) {
			this.x = x;
			this.y = y;
			this.h = h;
		}
	}
	
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,1,-1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] board = new int[N][N];
		boolean [][] chk = new boolean[N][N];
		boolean [][] safe = new boolean[N][N];
		PriorityQueue<Information> pq = new PriorityQueue<>(new Comparator<Information>() {

			@Override
			public int compare(Information o1, Information o2) {
				// TODO Auto-generated method stub
				return o1.h - o2.h;
			}
		});
		int min  = 1000;
		int max = 0;
		Queue<Point> q = new LinkedList<Point>();
		
 		for(int i = 0; i<N; i++) {
 			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j<N; j++) {
				
				board[i][j] = Integer.parseInt(st.nextToken());
				min = Math.min(board[i][j], min);
				max = Math.max(board[i][j], max);
				pq.add(new Information(i, j, board[i][j]));
				
			}
		}
 		int ans = 1;
 		for(int height = min; height<max; height++) {
 			int zone = 0;
 			while(!pq.isEmpty()) {
 				Information I  = pq.peek();
 				
 				int h = I.h;
 				
 				if(h > height) break;
 				pq.poll();
 				
 				int x = I.x;
 				int y = I.y;
 				
 				chk[x][y] = true;
 				
 			}
 			
 			for(int i = 0; i<N; i++) {
 				Arrays.fill(safe[i], false);
 			}
 			
 			for(int i = 0; i<N; i++) {
 				for(int j = 0; j<N; j++) {
 					if(safe[i][j]) continue; // 안전구역 체크 했거나
 					if(chk[i][j]) continue; // 이미 침수되었거나
 					zone++;
 					q.add(new Point(i, j));
 					
 					safe[i][j] = true;
 					
 					while(!q.isEmpty()) {
 						
 						Point p = q.poll();
 						
 						int x = p.x;
 						int y = p.y;
 						
 						for(int dir = 0; dir<4; dir++) {
 							
 							int mx = x + dx[dir];
 							
 							int my = y + dy[dir];
 							
 							if(mx< 0 || my < 0 || mx >= N || my >=N) continue;
 							if(chk[mx][my]) continue;
 							if(safe[mx][my]) continue;
 							
 							q.add(new Point(mx, my));
 							
 							safe[mx][my] = true;
 							
 						}
 						
 					}
 					
 					
 				}
 				
 			}
 			ans = Math.max(ans, zone);
 			
 		}
 		System.out.println(ans);
		

	}

}
