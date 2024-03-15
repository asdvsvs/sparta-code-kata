package org.sparta.programmers.pro_LV1;

public class AddingDigits {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                int answer = 0;
                String s = String.valueOf(n);

                for (int i = 0; i < s.length(); i++) {
                    answer += Integer.parseInt(String.valueOf(s.charAt(i)));
                }

                return answer;
            }
        }
    }
}
