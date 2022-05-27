

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_02941 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String[] list = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		for(int i = 0, size = list.length; i<size; i++) {
			s = s.replace(list[i], "!");
		}
		System.out.println(s.length());
	}

}
