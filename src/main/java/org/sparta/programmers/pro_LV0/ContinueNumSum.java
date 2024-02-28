package org.sparta.programmers.pro_LV0;

public class ContinueNumSum {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int num, int total) {
                int[] answer = new int[num];
                int sum = 0;
                int cnt = 0;

                for (int i = 0 - total - num; i <= total + num; i++) {
                    sum = 0;
                    for (int j = 0; j < num; j++) {
                        sum += i + j;
                    }
                    if (sum == total) {
                        for (int k = i; k < i + num; k++) {
                            answer[cnt] = k;
                            cnt++;
                        }
                    }
                }

                return answer;
            }
        }
    }
}
