package org.sparta.programmers.pro_LV0;

public class DiceNum {

    public static void main(String[] args) {
        class Solution {

            public int solution(int[] box, int n) {
                int answer = 0;

                answer += box[0] / n;
                answer *= box[1] / n;
                answer *= box[2] / n;

                return answer;
            }
        }
    }
}
