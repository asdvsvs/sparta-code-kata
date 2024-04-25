package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/42747#

import java.util.Arrays;

public class Pro_42747 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] citations) {
                int answer = 0;

                Arrays.sort(citations);
                loop:
                for (int i = citations[citations.length - 1]; i >= 0; i--) {
                    for (int j = 0; j < citations.length; j++) {
                        if (citations[j] >= i) {
                            if (citations.length - j >= i) {
                                answer = i;
                                break loop;
                            }
                            break;
                        }
                    }
                }

                return answer;
            }
        }
    }
}
