package org.sparta.programmers.pro_LV0;

//https://school.programmers.co.kr/learn/courses/30/lessons/181909

import java.util.Arrays;

public class Pro_181909 {
    public static void main(String[] args) {
        class Solution {
            public String[] solution(String my_string) {
                String[] answer = new String[my_string.length()];

                for (int i = my_string.length() - 1; i >= 0; i--) {
                    answer[i] = my_string.substring(i);
                }
                Arrays.sort(answer);

                return answer;
            }
        }
    }
}
