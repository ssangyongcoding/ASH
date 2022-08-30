package year2022.month08.day30;

import java.io.IOException;
import java.util.*;

//Climbing Stairs
public class Leatcode_0015 {
	static HashSet<List<Integer>> ans;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int nums[] = { -1, 0, 1, 2, -1, -4 };
		Arrays.sort(nums);
		int size = nums.length;
		int cnt = 0;
		ans = new HashSet<>();
		for (int idx = 0; idx < size; idx++) {
			if (nums[idx] > 0)
				break;

			int left = size-1;
			int right = idx + 1;

			int sum;
			while (true) {
				if(right>=left) break;
				sum = nums[idx] + nums[right] + nums[left];
				if (sum < 0) {
					right++;
				} else if (sum > 0) {
					left--;
				} else {
					ArrayList<Integer> list = new ArrayList<>();
					list.add(idx);
					list.add(right);
					list.add(left);
					ans.add(list);
					left--;
					right++;
				}
			}
		}

	}

}
