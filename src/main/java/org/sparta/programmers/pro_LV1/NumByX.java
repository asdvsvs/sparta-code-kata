package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12954
public class NumByX {
    public static void main(String[] args) {
        class Solution {
            public long[] solution(int x, int n) {
                long[] answer = new long[n];

                for (int i = 0; i < n; i++) {
                    answer[i] = x + (long) i * x;
                }

                return answer;
            }
        }
    }
}
