package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12934
public class DetermineRoot {
    public static void main(String[] args) {
        class Solution {
            public long solution(long n) {
                long answer = -1;


                for (long l = 0; l <= Math.sqrt(n); l++) {
                    if (l * l == n) {
                        answer = (l + 1) * (l + 1);
                    }
                }

                return answer;
            }
        }
    }
}
