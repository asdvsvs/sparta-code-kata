package org.sparta.programmers.lv4;

public class PredictedBrackets {

    public static void main(String[] args) {
        class Solution {

            public int solution(int n, int a, int b) {
                int answer = 0;

                while (true) {
                    answer++;
                    if (a % 2 != 0 && a + 1 == b) {
                        break;
                    }
                    if (b % 2 != 0 && b + 1 == a) {
                        break;
                    }
                    a = (a + 1) / 2;
                    b = (b + 1) / 2;
                }

                return answer;
            }
        }
    }

}
