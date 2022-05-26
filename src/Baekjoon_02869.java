import java.util.Scanner;

public class Baekjoon_02869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long V = sc.nextLong();

		long move = A - B;
		long day = V / (A - B) - A;
		long sum = move * day;
		while (sum < V) {
			day++;
			sum += A;
			if (sum >= V)
				break;
			sum -= B;
		}
		
		System.out.println(day);

	}

}
