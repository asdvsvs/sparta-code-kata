package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/70129
public class Pro_70129 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(String s) {
                int[] answer = new int[2];

                while (!s.equals("1")) {
                    answer[0]++;
                    int beforeLen = s.length();
                    s = s.replace("0", "");
                    answer[1] += beforeLen - s.length();
                    s = Integer.toBinaryString(s.length());
                }

                return answer;
            }
        }
    }
}
