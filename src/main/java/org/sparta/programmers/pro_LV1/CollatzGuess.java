package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12943
public class CollatzGuess {
    public static void main(String[] args) {
        class Solution {
            public int solution(int num) {
                int answer = 0;
                long n = num;
                while (n != 1) {
                    if (n % 2 == 0) {
                        n /= 2;
                    } else {
                        n = n * 3 + 1;
                    }
                    answer++;
                }
                if (answer >= 500) {
                    answer = -1;
                }
                return answer;
            }
        }
    }
}
