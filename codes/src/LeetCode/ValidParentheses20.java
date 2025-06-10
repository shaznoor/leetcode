package LeetCode;

import java.util.Stack;

public class ValidParentheses20 {
    public static boolean isValid(String s) {
        Stack<Character> ans = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                ans.push(c);
            } else {
                if (ans.isEmpty() ||
                        c == ')' && ans.pop() != '(' ||
                        c == '}' && ans.pop() != '{' ||
                        c == ']' && ans.pop() != '[') {
                    return false;
                }
            }
        }
        return ans.isEmpty();
    }

    public static void main(String[] args) {
        String ans = "(){}[]";
        System.out.println(isValid(ans));
    }
}
