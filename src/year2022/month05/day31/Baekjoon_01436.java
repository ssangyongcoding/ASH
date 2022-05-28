package year2022.month05.day31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 영화감독 숌
public class Baekjoon_01436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i<1000000000; i++) {
			if(String.valueOf(i).contains("666")){
				cnt++;
				if(cnt == n) {
					System.out.println(i);
					break;
				}
			}
		}
	}

}
