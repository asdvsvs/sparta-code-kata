package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/42889

import java.util.Arrays;

public class FailureRate {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int N, int[] stages) {
                int[] answer = new int[N];
                float[] fail = new float[N];

                for (int i = 1; i <= N; i++) {
                    int total = 0;
                    int count = 0;
                    for (int j : stages) {
                        if (j >= i) {
                            total++;
                        }
                        if (j == i) {
                            count++;
                        }
                    }
                    if (total != 0) {
                        fail[i - 1] = (float) count / total;
                    } else {
                        fail[i - 1] = 0;
                    }
                }

                float[] temp = new float[N];
                for (int i = 0; i < N; i++) {
                    temp[i] = fail[i];
                }

                Arrays.sort(temp);
                int idx = N - 1;

                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (fail[j] == temp[idx]) {
                            answer[i] = j + 1;
                            fail[j] = -1;
                            idx--;
                            break;
                        }
                    }
                }

                return answer;
            }
        }
    }
}
