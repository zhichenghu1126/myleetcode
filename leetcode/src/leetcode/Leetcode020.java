package leetcode;

import java.util.HashMap;
import java.util.Stack;

public class Leetcode020 {

	public static void main(String[] args) {
		String str = "[()]";
		boolean valid = isValid(str);
		System.out.println(valid);
	}

	public static boolean isValid(String s) {

		Stack<Character> stack = new Stack<Character>();

		if (s == null || s.length() == 0) {
			return true;
		}

		char[] charArray = s.toCharArray();
		for (char c : charArray) {
			if (stack.isEmpty()) {
				stack.push(c);
			} else if (isSuit(stack.peek(), c)) {
				stack.pop();
			} else {
				stack.push(c);
			}

		}
		return stack.isEmpty();

	}

	private static boolean isSuit(char c1, char c2) {
		return c1 == '(' && c2 == ')' || c1 == '[' && c2 == ']' || c1 == '{' && c2 == '}';
	}

	/*
	 * public static boolean isValid(String s) { Stack<Character>stack = new
	 * Stack<Character>(); for(char c: s.toCharArray()){ if(c=='(')stack.push(')');
	 * else if(c=='[')stack.push(']'); else if(c=='{')stack.push('}'); else
	 * if(stack.isEmpty()||c!=stack.pop())return false; } return stack.isEmpty(); }
	 */

}
