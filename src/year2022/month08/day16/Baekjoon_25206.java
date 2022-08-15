package year2022.month08.day16;
// 너의 평점은

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon_25206 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = 20;
		double sum = 0;
		double total= 0;
		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			String subject = st.nextToken();
			double point = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();

			if (grade.equals("P")) {
			}
			else {
				total += point;
			}
			 if (grade.equals("A+")) {
				sum += point * 4.5;
			} else if (grade.equals("A0")) {
				sum += point * 4.0;
			} else if (grade.equals("B+")) {
				sum += point * 3.5;
			} else if (grade.equals("B0")) {
				sum += point * 3.0;
			} else if (grade.equals("C+")) {
				sum += point * 2.5;
			} else if (grade.equals("C0")) {
				sum += point * 2.0;
			} else if (grade.equals("D+")) {
				sum += point * 1.5;
			} else if (grade.equals("D0")) {
				sum += point * 1.0;
			} else if (grade.equals("F")) {
				sum += point * 0.0;
			}

		}
		
		System.out.println(String.format("%.6f", sum / total));

	}

}
