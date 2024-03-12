package org.sparta.programmers.pro_LV0;

import java.util.Arrays;

public class CreateMaxNum2 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] numbers) {
                int answer = 0;

                Arrays.sort(numbers);
                int a = numbers[0] * numbers[1];
                int b = numbers[numbers.length - 1] * numbers[numbers.length - 2];
                answer = Math.max(a, b);

                return answer;
            }
        }
    }
}
