package com.stack;

import java.util.Stack;

public class BalancedBrackets {
	 public static void main(String[] args) {
	        String exp1 = "[()]{}{[()()]()}";
	        String exp2 = "[(])";

	        System.out.println(exp1 + " → " + (isBalanced(exp1) ? "Balanced" : "Not Balanced"));
	       System.out.println(exp2 + " → " + (isBalanced(exp2) ? "Balanced" : "Not Balanced"));


	    }

	    public static boolean isBalanced(String exp) {
	        Stack<Character> stack = new Stack<>();

	        for (char ch : exp.toCharArray()) {
	            if (ch == '(' || ch == '{' || ch == '[') {
	                stack.push(ch);
	            } else if (ch == ')' || ch == '}' || ch == ']') {
	               if (stack.isEmpty()) {
					return false;
				}

	               char top = stack.pop();
	                if ((ch == ')' && top != '(') ||
	                   (ch == '}' && top != '{') ||
	                   (ch == ']' && top != '[')) {
	                    return false;
	                }
	            }
	    }



	        return stack.isEmpty();
	    }
}
