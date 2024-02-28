package org.sparta.programmers.pro_LV1;

import java.util.Stack;

public class CranePuzzleGame {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[][] board, int[] moves) {
                int answer = 0;

                Stack<Integer> stack = new Stack<>();

                for (int i : moves) {
                    i--;
                    for (int[] arr : board) {
                        if (arr[i] != 0) {
                            if (!stack.isEmpty() && stack.peek() == arr[i]) {
                                stack.pop();
                                answer += 2;
                            } else {
                                stack.push(arr[i]);
                            }
                            arr[i] = 0;
                            break;
                        }
                    }
                }

                for (int i : stack) {
                    System.out.println(i);
                }

                return answer;
            }
        }
    }
}
