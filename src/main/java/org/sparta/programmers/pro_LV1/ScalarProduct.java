package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/70128
public class ScalarProduct {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] a, int[] b) {
                int answer = 0;

                for (int i = 0; i < a.length; i++) {
                    answer += a[i] * b[i];
                }

                return answer;
            }
        }
    }
}
