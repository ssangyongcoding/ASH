package year2022.month08.day23;

import java.io.IOException;
import java.util.*;

//Word Search
public class Leatcode_0070 {

	static char[][] map;
	static boolean answer = false;
	static char[] ans;
	static boolean[][] chk;
	static int size;
	static int n, m;
	static int dx[] = { 1, -1, 0, 0 };
	static int dy[] = { 0, 0, 1, -1 };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCB";
		ans = word.toCharArray();
		n = board.length;
		m = board[0].length;
		map = Arrays.copyOf(board, n);
		size = ans.length;
		System.out.println(n + " / " + m);
		
		
		for(int x = 0; x < n; x++) {
			for(int y = 0; y < m; y++) {
				if(ans[0] != map[x][y]) continue;
				chk = new boolean[n][m];
				chk[x][y] = true;
				System.out.println(x + " , " + y);
				dfs(x, y, 0);
				if(answer == true) break; 
			}
			if(answer == true) break; 
		}
		System.out.println(answer);

	}

	private static void dfs(int x, int y, int index) {
		
		if(index == size - 1) {
			System.out.println("true");
			answer = true;
			return;
		}
	
		for(int dir = 0; dir < 4; dir++) {
			
			int mx = x + dx[dir];
			int my = y + dy[dir];
			System.out.println("=" + mx + " , "+ my);
			
			if(mx < 0 || my < 0 || mx >= n || my >= m) continue;
			if(chk[mx][my]) continue;
			if(ans[index+1] != map[mx][my]) continue;
			System.out.println("ㄴ"+ (index+1) + "번째 좌표 : " + mx + " , "+ my + " / " + ans[index+1]);
			chk[mx][my] = true;
			dfs(mx, my, index+1);
			chk[mx][my] = false;
			
		}
		
		
		
	}

}
