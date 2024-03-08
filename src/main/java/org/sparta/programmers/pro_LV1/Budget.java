package org.sparta.programmers.pro_LV1;

import java.util.Arrays;

public class Budget {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] d, int budget) {
                int answer = 0;
                int sum = 0;

                Arrays.sort(d);
                for (int i : d) {
                    if (sum + i > budget) {
                        break;
                    }
                    sum += i;
                    answer++;
                }

                return answer;
            }
        }
    }
}
