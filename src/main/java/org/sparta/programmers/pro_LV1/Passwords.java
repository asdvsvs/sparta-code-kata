package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/155652
public class Passwords {
    public static void main(String[] args) {
        class Solution {
            public String solution(String s, String skip, int index) {
                String answer = "";
                char[] arr = s.toCharArray();

                for (char c : arr) {
                    for (int j = 0; j < index; j++) {
                        c++;
                        if (c > 'z') {
                            c = 'a';
                        }
                        while (skip.contains(String.valueOf(c))) {
                            c++;
                            if (c > 'z') {
                                c = 'a';
                            }
                        }
                    }
                    answer += c;
                }

                return answer;
            }
        }
    }
}
