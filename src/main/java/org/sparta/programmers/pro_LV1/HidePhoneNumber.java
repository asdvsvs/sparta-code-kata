package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12948
public class HidePhoneNumber {
    public static void main(String[] args) {
        class Solution {
            public String solution(String phone_number) {
                String answer = "";

                int cnt = phone_number.length() - 4;
                answer = phone_number.substring(phone_number.length() - 4);
                for (int i = 0; i < cnt; i++) {
                    answer = "*" + answer;
                }

                return answer;
            }
        }
    }
}
