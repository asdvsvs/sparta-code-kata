package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12985
public class Pro_12985 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n, int a, int b) {
                int answer = 0;

                while (true) {
                    answer++;

                    if (a % 2 == 1) {
                        a++;
                    }
                    if (b % 2 == 1) {
                        b++;
                    }
                    if (a == b) {
                        break;
                    }
                    a /= 2;
                    b /= 2;
                }

                return answer;
            }
        }
    }
}
