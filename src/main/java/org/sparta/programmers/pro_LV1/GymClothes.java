package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/42862

import java.util.Arrays;

public class GymClothes {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n, int[] lost, int[] reserve) {
                int answer = n;
                Arrays.sort(lost);
                Arrays.sort(reserve);

                for (int i = 0; i < lost.length; i++) {
                    for (int j = 0; j < reserve.length; j++) {
                        if (lost[i] == reserve[j]) {
                            lost[i] = 0;
                            reserve[j] = 0;
                            break;
                        }
                    }
                }

                for (int i = 0; i < lost.length; i++) {
                    for (int j = 0; j < reserve.length; j++) {
                        if (lost[i] != 0 && reserve[j] != 0) {
                            if (lost[i] == reserve[j] - 1) {
                                lost[i] = 0;
                                reserve[j] = 0;
                                break;
                            } else if (lost[i] == reserve[j] + 1) {
                                lost[i] = 0;
                                reserve[j] = 0;
                                break;
                            }
                        }
                    }
                }

                for (int i : lost) {
                    if (i != 0) {
                        answer--;
                    }
                }

                return answer;
            }
        }
    }
}
