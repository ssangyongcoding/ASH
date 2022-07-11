package year2022.month07.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 섬의 개수
public class Baekjoon_04963 {
	static int[][] map;
	static boolean[][] chk;
	static int w, h;
	
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

	static int[] dx = { 1, -1, 0, 0, 1, 1, -1, -1 };
	static int[] dy = { 0, 0, 1, -1, 1, -1, 1, -1 };

	static void BFS(Location l) {
		Queue<Location> q = new LinkedList<Location>();
		q.add(l);
		chk[l.x][l.y] = true;

		while (!q.isEmpty()) {

			Location a = q.poll();
			int x = a.x;
			int y = a.y;
			for (int i = 0; i < 8; i++) {
				int mx = x + dx[i];
				int my = y + dy[i];

				if (mx < 0 || my < 0 || mx > h - 1 || my > w - 1)
					continue;
				if (chk[mx][my])
					continue;
				if (map[mx][my] == 0)
					continue;
				Location next = new Location(mx, my);

				chk[mx][my] = true;
				q.add(next);

			}

		}

	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		while (true) {
			st = new StringTokenizer(br.readLine(), " ");
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			if (w == 0 && h == 0)
				break;
			map = new int[h][w];
			chk = new boolean[h][w];

			for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < w; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			int result = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j] == 0)
						continue;
					if (chk[i][j])
						continue;
					Location go = new Location(i, j);
					BFS(go);
					result++;
				}
			}
			sb.append(result).append("\n");
		}
		System.out.println(sb.toString());


	}

}
