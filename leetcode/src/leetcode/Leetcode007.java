package leetcode;

/**
 * 
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 
 * 假设我们的环境只能存储得下 32 位的有符号整数
 * 
 * 请根据这个假设，如果反转后整数溢出那么就返回 0。
 * 
 */
public class Leetcode007 {

	public static void main(String[] args) {
		int i = -12345;
		int reverse = reverse(i);
		System.out.println(reverse);
	}

	private static int reverse(int x) {
		int r = 0;
		while (x != 0) {
			int pop = x % 10;
			x = x / 10;
			if (r < Integer.MIN_VALUE / 10 || r > Integer.MAX_VALUE / 10) {
				return 0;
			}
			r = r * 10 + pop;
		}
		return r;
	}

}
