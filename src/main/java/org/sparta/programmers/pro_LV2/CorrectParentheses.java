package org.sparta.programmers.pro_LV2;

import java.util.Stack;

public class CorrectParentheses {
    public static void main(String[] args) {
        class Solution {
            boolean solution(String s) {
                boolean answer = true;

                Stack<Character> stack = new Stack<>();

                char[] ch = s.toCharArray();
                for (char c : ch) {
                    if (stack.isEmpty() && c == '(') {
                        stack.push(c);
                    } else if (!stack.isEmpty()) {
                        if (stack.peek() != c) {
                            stack.pop();
                        } else {
                            stack.push(c);
                        }
                    } else return false;
                }

                if (!stack.isEmpty() && stack.peek() == '(') {
                    return false;
                }

                return answer;
            }
        }
    }
}
