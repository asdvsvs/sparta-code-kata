package org.sparta.programmers.pro_LV1;

public class Overlay {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n, int m, int[] section) {
                int answer = 0;
                int painted = 0;

                for (int i : section) {
                    if (painted < i) {
                        painted = i + m - 1;
                        answer++;
                    }
                }

                return answer;
            }
        }
    }
}
