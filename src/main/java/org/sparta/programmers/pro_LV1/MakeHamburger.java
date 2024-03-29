package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/133502

import java.util.Stack;

public class MakeHamburger {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] ingredient) {
                int answer = 0;

                int[] ham = {1, 3, 2, 1};
                Stack<Integer> stack = new Stack<>();
                Stack<Integer> temp = new Stack<>();

                for (int i = 0; i < ingredient.length; i++) {
                    stack.push(ingredient[i]);

                    if (stack.size() >= 4) {
                        int cnt = 0;
                        for (int h : ham) {
                            if (h == stack.peek()) {
                                temp.push(stack.pop());
                            } else {
                                while (!temp.isEmpty()) {
                                    stack.push(temp.pop());
                                }
                                break;
                            }
                            cnt++;
                        }
                        if (cnt == 4) {
                            temp.clear();
                            answer++;
                        }
                    }
                }

                return answer;
            }
        }
    }
}
