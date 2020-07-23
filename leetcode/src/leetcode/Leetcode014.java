package leetcode;

/**
 * 
 * 查找字符串数组中的最长公共前缀。
 * 
 * 如果不存在公共前缀，返回空字符串
 *
 */
public class Leetcode014 {

	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };
		String longestCommonPrefix = longestCommonPrefix(strs);
		System.out.println(longestCommonPrefix);
	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++) {
			prefix = longestCommonPrefix(prefix, strs[i]);
			if (prefix.length() == 0) {
				break;
			}
		}
		return prefix;
	}

	public static String longestCommonPrefix(String str1, String str2) {
		int len = Math.min(str1.length(), str2.length());
		int index = 0;
		while (index < len && str1.charAt(index) == str2.charAt(index)) {
			index++;
		}
		return str1.substring(0, index);
	}

}
