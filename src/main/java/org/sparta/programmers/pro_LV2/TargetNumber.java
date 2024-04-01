package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/43165
public class TargetNumber {
    public static void main(String[] args) {
        class Solution {
            static int answer = 0;

            public int solution(int[] numbers, int target) {

                f(numbers, target, 0, 0);

                return answer;
            }

            void f(int[] numbers, int target, int depth, int num) {
                // System.out.println(depth+", "+num);
                if (depth == numbers.length) {
                    if (target == num) {
                        answer++;
                    }
                    return;
                }

                f(numbers, target, depth + 1, num + numbers[depth]);
                f(numbers, target, depth + 1, num - numbers[depth]);
            }
        }
    }
}
