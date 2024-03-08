package org.sparta.programmers.pro_LV1;

import java.util.Arrays;

public class FruitVendor {
    public static void main(String[] args) {
        class Solution {
            public int solution(int k, int m, int[] score) {
                int answer = 0;

                Arrays.sort(score);
                int trash = score.length % m;
                for (int i = trash; i < score.length; i += m) {
                    answer += score[i] * m;
                }

                return answer;
            }
        }
    }
}
