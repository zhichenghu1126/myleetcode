package leetcode;

import java.util.HashMap;

/**
 * ���� nums = [2, 7, 11, 15], target = 9
 * 
 * ��Ϊ nums[0] + nums[1] = 2 + 7 = 9 ���Է��� [0, 1]
 * 
 * 
 */
public class Leetcode001 {

	public static void main(String[] args) {
		int nums[] = { 2, 7, 7, 15 };
		int[] twoSum = twoSum(nums, 14);
		for (int i : twoSum) {
			System.out.println(i);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0;i<nums.length;i++) {
			if(map.containsKey(target-nums[i])&&map.get(target-nums[i])!=i) {
				return new int [] {map.get(target-nums[i]),i};
			}
			map.put(nums[i],i);
		}
		throw new RuntimeException("no sum");
		
	}

}
