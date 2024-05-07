package org.sparta.programmers.pro_LV0;

//https://school.programmers.co.kr/learn/courses/30/lessons/181836
public class Pro_181836 {
    public static void main(String[] args) {
        class Solution {
            public String[] solution(String[] picture, int k) {
                String[] answer = new String[picture.length * k];
                for (int i = 0; i < answer.length; i++) {
                    answer[i] = "";
                }

                for (int i = 0; i < picture.length; i++) {
                    for (int j = 0; j < picture[i].length(); j++) {
                        for (int a = 0; a < k; a++) {
                            for (int b = 0; b < k; b++) {
                                answer[(i * k) + a] += picture[i].charAt(j);
                            }
                        }
                    }
                }


                return answer;
            }
        }
    }
}
