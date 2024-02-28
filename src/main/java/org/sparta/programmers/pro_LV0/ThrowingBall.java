package org.sparta.programmers.pro_LV0;

public class ThrowingBall {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] numbers, int k) {
                int answer = 0;
                int idx = 0;
                int cnt = 0;

                while (cnt < k) {
                    if (idx > numbers.length - 1) {
                        idx -= numbers.length;
                    }
                    idx += 2;
                    cnt++;
                }
                answer = numbers[idx - 2];

                return answer;
            }
        }
    }
}
