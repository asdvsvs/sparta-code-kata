package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/136798
public class KnightWeapon {
    public static void main(String[] args) {
        class Solution {
            public int solution(int number, int limit, int power) {
                int answer = 1;

                for (int i = 2; i <= number; i++) {
                    int sum = 0;
                    for (int j = 1; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            if (j == Math.sqrt(i)) {
                                sum--;
                            }
                            sum += 2;
                        }
                    }

                    if (sum > limit) {
                        answer += power;
                    } else {
                        answer += sum;
                    }
                }

                return answer;
            }
        }
    }
}
