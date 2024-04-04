package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12941

import java.util.Arrays;

public class Pro_12941 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] A, int[] B) {
                int answer = 0;
                Arrays.sort(A);
                Arrays.sort(B);
                int big = B.length - 1;

                for (int i = 0; i < A.length; i++) {
                    answer += A[i] * B[big - i];
                }
                return answer;
            }
        }
    }
}
