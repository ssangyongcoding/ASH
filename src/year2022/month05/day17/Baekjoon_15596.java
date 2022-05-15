package year2022.month05.day17;

// 정수 N개의 합
public class Baekjoon_15596 {

	private static long sum(int[] a) {
		
		long sum = 0;
		
		for(int i = 0, size = a.length; i < size; i++) {
			
			sum += a[i];
		}
		
		return sum;
	}

}
