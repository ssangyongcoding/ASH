package year2022.month05.day17;
// 셀프 넘버
public class Baekjoon_04673 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		boolean chk[] = new boolean[10001];
		
		for(int i = 1; i<=10000; i++) {
			if(chk[i]) continue;
			sb.append(i).append("\n");
			int now = i;
			while(now <= 10000) {
				int next = now;
				chk[next] = true;
				int sum = now;
				
				while( next > 0) {
					sum += next%10;
					next /= 10;
				}
				
				now = sum;
			}
		}
		System.out.println(sb.toString());
	}

}
