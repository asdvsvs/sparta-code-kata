package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/86051
public class AddingNum {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] numbers) {
                int answer = 0;

                for (int i = 0; i < 10; i++) {
                    answer += i;
                }
                for (int i : numbers) {
                    answer -= i;
                }

                return answer;
            }
        }
    }
}
