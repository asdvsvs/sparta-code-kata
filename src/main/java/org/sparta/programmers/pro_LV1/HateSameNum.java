package org.sparta.programmers.pro_LV1;

import java.util.Stack;

public class HateSameNum {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] arr) {
                Stack<Integer> stack = new Stack<>();

                for (int i : arr) {
                    if (stack.isEmpty() || stack.peek() != i) {
                        stack.push(i);
                    }
                }

                int[] answer = new int[stack.size()];
                for (int i = stack.size() - 1; i >= 0; i--) {
                    answer[i] = stack.pop();
                }

                return answer;
            }
        }
    }
}
