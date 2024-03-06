package org.sparta.programmers.pro_LV0;

public class CompositeNum {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                int answer = 0;

                for (int i = 2; i <= n; i++) {
                    for (int j = 2; j < n; j++) {
                        if (i != j && i % j == 0) {
                            answer++;
                            break;
                        }
                    }
                }

                return answer;
            }
        }
    }
}
