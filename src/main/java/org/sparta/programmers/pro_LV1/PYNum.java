package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12916
public class PYNum {
    public static void main(String[] args) {
        class Solution {
            boolean solution(String s) {
                boolean answer = true;
                int cnt = 0;

                s = s.toUpperCase();
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == 'P') {
                        cnt++;
                    }
                    if (s.charAt(i) == 'Y') {
                        cnt--;
                    }
                }
                if (cnt == 0) {
                    answer = true;
                } else {
                    answer = false;
                }

                return answer;
            }
        }
    }
}
