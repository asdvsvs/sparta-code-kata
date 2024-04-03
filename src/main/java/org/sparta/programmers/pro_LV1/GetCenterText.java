package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12903
public class GetCenterText {
    public static void main(String[] args) {
        class Solution {
            public String solution(String s) {
                String answer = "";

                if (s.length() % 2 == 0) {
                    answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
                } else {
                    answer = String.valueOf(s.charAt(s.length() / 2));
                }

                return answer;
            }
        }
    }
}
