package org.sparta.programmers.pro_LV0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120878
public class DeterminingFinitePrimeNum {
    public static void main(String[] args) {
        class Solution {
            public int solution(int a, int b) {
                int answer = 2;

                for (int i = 2; i <= a; i++) {
                    if (a % i == 0 && b % i == 0) {
                        a /= i;
                        b /= i;
                    }
                }

                while (b != 1) {
                    if (b % 2 == 0) {
                        b /= 2;
                    } else if (b % 5 == 0) {
                        b /= 5;
                    } else {
                        break;
                    }
                }

                if (b == 1) {
                    answer = 1;
                }

                return answer;
            }
        }
    }
}
