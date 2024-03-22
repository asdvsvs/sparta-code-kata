package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/82612
public class CalculateAmount {
    public static void main(String[] args) {
        class Solution {
            public long solution(int price, int money, int count) {
                long answer = 0;

                for (int i = 1; i <= count; i++) {
                    answer -= price * i;
                }
                if (answer + money < 0) {
                    answer = Math.abs(answer + money);
                } else {
                    answer = 0;
                }

                return answer;
            }
        }
    }
}
