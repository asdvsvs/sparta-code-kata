package org.sparta.programmers.lv5;

import java.util.Stack;

public class AfterBigNumber {

    public static void main(String[] args) {

        class Solution {

            public int[] solution(int[] numbers) {
                int[] result = new int[numbers.length];
                Stack<Integer> stack = new Stack<>();

                for (int i = numbers.length - 1; i >= 0; i--) {
                    while (!stack.isEmpty() && stack.peek() <= numbers[i]) {
                        stack.pop();
                    }

                    if (stack.isEmpty()) {
                        result[i] = -1;
                    } else {
                        result[i] = stack.peek();
                    }

                    stack.push(numbers[i]);
                }

                return result;
            }
        }
    }

}
