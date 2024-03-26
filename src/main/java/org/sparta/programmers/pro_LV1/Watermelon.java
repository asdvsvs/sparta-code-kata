package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12922
public class Watermelon {
    public static void main(String[] args) {
        class Solution {
            public String solution(int n) {
                String answer = "";

                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        answer += "수";
                    } else {
                        answer += "박";
                    }
                }

                return answer;
            }
        }
    }
}
