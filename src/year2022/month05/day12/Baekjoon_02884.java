package year2022.month05.day12;

import java.util.Scanner;

// 알람 시계
public class Baekjoon_02884 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int minutes = sc.nextInt();

		if (minutes >= 45) {
			minutes -= 45;
		} else {

			minutes += 15;
			hour--;

			if (hour < 0)
				hour = 23;
		}
		System.out.println(hour + " " + minutes);
	}
}
