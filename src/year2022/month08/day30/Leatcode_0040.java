package year2022.month08.day30;
import java.io.IOException;
import java.util.*;
//Permutations
public class Leatcode_0040 {
	static int [] candidates;
	static int target;
	static int size;
	static boolean chk[];
	static  HashSet<List<Integer>> ans;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[] input = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		candidates = Arrays.copyOf(input, input.length);
		size = input.length;
		Arrays.sort(candidates);
		chk = new boolean[size];
		ans = new HashSet<List<Integer>>();
		target = 30;
		System.out.println("시작");
		combination(0, 0);
		ArrayList answer = new ArrayList(ans);
		for(int i = 0; i<answer.size(); i++) {
			System.out.println(answer.get(i).toString());
		}

	}
	private static void combination(int index, int sum) {
		if(sum > target) return;
		if(sum == target) {
			ArrayList<Integer> list = new ArrayList<>();
			for(int idx = 0; idx < size; idx++) {
				if(!chk[idx])  continue;
				list.add(candidates[idx]);
			}
			ans.add(list);
			return;
		}
		if(index == size) {
			return;
		}
		for(int idx = index; idx<size; idx++) {
			if( idx != index && (candidates[idx] == candidates[idx-1])) continue;
			if(candidates[idx] + sum > target) break;
			System.out.println("들어옴");
			combination(idx + 1, sum + candidates[idx]);
		}
		
	}

	

}
