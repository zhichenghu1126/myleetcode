package leetcode;

/**
 * 
 * 判断一个整数是否是回文数。 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 */
public class Leetcode009 {

	public static void main(String[] args) {
		int a = 123454321;
		boolean palindrome = isPalindrome(a);
		System.out.println(palindrome);
	}

	public static boolean isPalindrome(int x) {
		int a = x;
		int r = 0;
		if(x<0) {
			return false;
		}
		while (x != 0) {
			int pop = x % 10;
			x = x / 10;
			r = r * 10 + pop;
		}
		if (a != r) {
			return false;
		} else {
			return true;
		}
	}

}
