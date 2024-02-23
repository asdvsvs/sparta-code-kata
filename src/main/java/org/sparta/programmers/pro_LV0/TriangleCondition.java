package org.sparta.programmers.pro_LV0;

public class TriangleCondition {

    public static void main(String[] args) {
        class Solution {

            public int solution(int[] sides) {
                int answer = 0;

                int big = Math.max(sides[0], sides[1]);
                int small = Math.min(sides[0], sides[1]);

                for (int i = 1; i < big + small; i++) {
                    if (small + i > big && small + big > i) {
                        answer++;
                    }
                }

                return answer;
            }
        }
    }

}
