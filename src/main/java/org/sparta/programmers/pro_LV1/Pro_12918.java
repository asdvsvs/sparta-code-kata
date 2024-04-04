package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12918
public class Pro_12918 {
    public static void main(String[] args) {
        class Solution {
            public boolean solution(String s) {
                boolean answer = true;

                if (s.length() != 4 && s.length() != 6) {
                    answer = false;
                }
                char[] ch = s.toCharArray();
                for (char c : ch) {
                    if (c < 48 || c > 57) {
                        answer = false;
                        break;
                    }
                }

                return answer;
            }
        }
    }
}
