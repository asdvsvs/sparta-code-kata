package org.sparta.programmers.pro_LV0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120923
public class ContinueNumSum2 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int num, int total) {
                int[] answer = new int[num];
                for (int i = -49; i <= 1000; i++) {
                    int sum = 0;

                    for (int j = 0; j < num; j++) {
                        sum += i + j;
                    }

                    if (sum == total) {
                        answer[0] = i;
                        break;
                    }
                }
                for (int i = 1; i < num; i++) {
                    answer[i] = answer[i - 1] + 1;
                }

                return answer;
            }
        }
    }
}
