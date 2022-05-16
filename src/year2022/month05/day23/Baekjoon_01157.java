package year2022.month05.day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 단어 공부
public class Baekjoon_01157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine().toUpperCase();
		
		int[] alpha = new int[26];
		
		for(int i = 0, size = s.length(); i < size; i++) {
			alpha[s.charAt(i) - 'A']++;
		}
		
		int idx = -1;
		int max = 0;
		boolean flag = true;
		
		for(int i = 0; i<26; i++) {
			if(alpha[i] > max) {
				flag = true;
				max = alpha[i];
				idx = i;
			} else if(alpha[i] == max) {
				flag = false;
			} 
		}
		
		if(flag) {
			System.out.println((char) (idx + 'A'));
		}else {
			System.out.println("?");
		}

	}

}
