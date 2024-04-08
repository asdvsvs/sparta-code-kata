package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12940
public class Pro_12940 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int n, int m) {
                int[] answer = new int[2];

                for (int i = Math.min(n, m); i >= 1; i--) {
                    if (n % i == 0 && m % i == 0) {
                        answer[0] = i;
                        break;
                    }
                }
                answer[1] = n * m / answer[0];

                return answer;
            }
        }
    }
}
