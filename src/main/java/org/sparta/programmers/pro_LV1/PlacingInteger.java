package org.sparta.programmers.pro_LV1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12933https://school.programmers.co.kr/learn/courses/30/lessons/12933

import java.util.Arrays;

public class PlacingInteger {
    public static void main(String[] args) {
        class Solution {
            public long solution(long n) {
                long answer = 0;
                String str = "";
                String s = String.valueOf(n);
                char[] c = s.toCharArray();
                Arrays.sort(c);
                for (int i = c.length - 1; i >= 0; i--) {
                    str = str + c[i];
                }
                answer = Long.parseLong(str);

                return answer;
            }
        }
    }
}
