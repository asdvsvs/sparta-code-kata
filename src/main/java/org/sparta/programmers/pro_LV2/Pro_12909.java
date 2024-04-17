package org.sparta.programmers.pro_LV2;
//https://school.programmers.co.kr/learn/courses/30/lessons/12909#

import java.util.Stack;

public class Pro_12909 {
    public static void main(String[] args) {
        class Solution {
            boolean solution(String s) {
                boolean answer = true;
                Stack<Character> stack = new Stack<>();

                for (int i = 0; i < s.length(); i++) {
                    if (stack.isEmpty()) {
                        stack.push(s.charAt(i));
                    } else if (stack.peek() == '(') {
                        if (s.charAt(i) == ')') {
                            stack.pop();
                        } else {
                            stack.push(s.charAt(i));
                        }
                    } else {
                        break;
                    }
                }

                if (stack.size() > 0) {
                    answer = false;
                }

                return answer;
            }
        }
    }
}
