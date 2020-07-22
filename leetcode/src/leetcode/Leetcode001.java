package leetcode;

import java.util.HashMap;

/**
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 
 * 因为 nums[0] + nums[1] = 2 + 7 = 9 所以返回 [0, 1]
 * 
 * 
 */
public class Leetcode001 {

	public static void main(String[] args) {
		int nums[] = { 2, 7, 11, 15 };
		twoSum(nums, 9);

	}

	public static int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
				System.out.println(i + "," + map.get(target - nums[i]));
				return new int[] { map.get(target - nums[i]), i };
			}
			map.put(nums[i], i);
		}

		return null;
	}

}
