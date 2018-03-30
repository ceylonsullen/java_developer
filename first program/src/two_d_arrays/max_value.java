package two_d_arrays;

import java.util.Arrays;

public class max_value {

	public static void main(String[] args) {
		int[][] nums = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int max = nums[0][0];
		for (int[] i : nums) {
			for (int j : i) {
				if (j > max) max = j;
			}
		}
		System.out.println(max);
	}

}
