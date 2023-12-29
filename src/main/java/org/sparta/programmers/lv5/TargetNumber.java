package org.sparta.programmers.lv5;

public class TargetNumber {

    public static void main(String[] args) {
        class Solution {

            static int count = 0;

            public int solution(int[] numbers, int target) {
                int answer = 0;

                function(target, numbers, 0, 0);
                answer = count;
                return answer;
            }

            public static void function(int target, int[] numbers, int depth, int sum) {
                if (depth == numbers.length) {
                    if (target == sum) {
                        count++;
                    }
                    return;
                }
                function(target, numbers, depth + 1, sum + numbers[depth]);
                function(target, numbers, depth + 1, sum - numbers[depth]);
            }
        }
    }

}
