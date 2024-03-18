package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/76501
public class AddingYinYang {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] absolutes, boolean[] signs) {
                int answer = 0;

                for (int i = 0; i < absolutes.length; i++) {
                    if (signs[i]) {
                        answer += absolutes[i];
                    } else {
                        answer -= absolutes[i];
                    }
                }

                return answer;
            }
        }
    }
}
