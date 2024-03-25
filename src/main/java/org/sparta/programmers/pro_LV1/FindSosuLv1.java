package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12921
public class FindSosuLv1 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                int answer = n - 1;

                for (int i = 2; i <= n; i++) {
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            answer--;
                            break;
                        }
                    }
                }

                return answer;
            }
        }
    }
}
