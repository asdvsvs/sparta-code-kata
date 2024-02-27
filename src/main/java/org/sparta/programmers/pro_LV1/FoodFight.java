package org.sparta.programmers.pro_LV1;

public class FoodFight {
    public static void main(String[] args) {
        class Solution {
            public String solution(int[] food) {
                String answer = "";
                String left = "";
                String right = "";

                for (int i = 1; i < food.length; i++) {
                    for (int j = 0; j < food[i] / 2; j++) {
                        left = left + i;
                        right = i + right;
                    }
                }
                answer = left + "0" + right;

                return answer;
            }
        }
    }
}
