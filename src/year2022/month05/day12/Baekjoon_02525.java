package year2022.month05.day12;

import java.util.Scanner;

// 오븐 시계
public class Baekjoon_02525 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int hours = sc.nextInt(); // 입력 시
		int minutes = sc.nextInt(); // 입력 분
		int time = sc.nextInt(); // 요리하는 데 필요한 시간
		
		int cookHours = time / 60; // 요리하는데 필요한 시간 (시)
		int cookMinutes = time % 60; // 요리하는데 필요한 시간 (분)
		
		minutes += cookMinutes; 
		
		if(minutes > 59) {
			minutes -= 60;
			hours++;
		}
		
		hours += cookHours;
		
		if(hours > 23) hours -= 24;
		
		System.out.println(hours + " " + minutes);
		
	}
}
