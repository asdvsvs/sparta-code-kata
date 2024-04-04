package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12917

import java.util.Arrays;

public class Pro_12917 {
    public static void main(String[] args) {
        class Solution {
            public String solution(String s) {
                String answer = "";
                String upper = "";

                char[] ch = s.toCharArray();
                Arrays.sort(ch);
                for (int i = ch.length - 1; i >= 0; i--) {
                    if (ch[i] >= 65 && ch[i] <= 90) {
                        upper += ch[i];
                    } else {
                        answer += ch[i];
                    }
                }
                answer += upper;

                return answer;
            }
        }
    }
}
