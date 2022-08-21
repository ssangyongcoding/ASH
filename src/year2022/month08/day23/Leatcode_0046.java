package year2022.month08.day23;
import java.io.IOException;
import java.util.*;
//Climbing Stairs
public class Leatcode_0046 {
	static List<List<Integer>> ans;
	static int size ;
	static int pick[];
	static int numbers[];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[] nums = {1, 2};
		size = nums.length;
		pick = new int[size];
		numbers = Arrays.copyOf(nums, size);
		ans = new ArrayList<>();
		

		permutation(0, 0);
		
		for(int i = 0, len = ans.size(); i<len; i++ ) {
			System.out.println(ans.get(i).toString());
			
		}
				
		
	}

	static void permutation(int idx, int flag) {
		// TODO Auto-generated method stub
		if(idx == size) {
			List<Integer> arr = new ArrayList<Integer>();
			
			for(int index = 0 ; index < size; index++) {
				arr.add(pick[index]);
			}
			
			ans.add(arr);
			return;
			
		}
		
		for(int index = 0; index < size; index++) {
			
			if(( flag & (1 << index )) > 0) continue;
			
			pick[idx] = numbers[index];
			
			permutation( idx+1, flag | 1 << index);
			
		}
		
		
		
	}

}
