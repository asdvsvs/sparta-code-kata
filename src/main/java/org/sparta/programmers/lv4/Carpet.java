package org.sparta.programmers.lv4;

public class Carpet {

    public static void main(String[] args) {
        class Solution {

            public int[] solution(int brown, int yellow) {
                int[] answer = new int[2];

                int total = brown + yellow;
                int x = 0;
                int y = 0;
                for (int i = 3; i < total / 2; i++) {
                    if (total % i == 0) {
                        x = total / i;
                        if (x * 2 + i * 2 - 4 == brown) {
                            y = i;
                            break;
                        }
                    }
                }
                answer[0] = x;
                answer[1] = y;
                return answer;
            }
        }
    }

}
