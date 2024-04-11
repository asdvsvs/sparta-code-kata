package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12926
public class Pro_12926 {
    public static void main(String[] args) {
        class Solution {
            public String solution(String s, int n) {
                StringBuilder answer = new StringBuilder();

                char[] ch = s.toCharArray();
                for (int i = 0; i < ch.length; i++) {
                    if (ch[i] != ' ') {
                        if (Character.isLowerCase(ch[i])) {
                            ch[i] += n;
                            if (ch[i] > 'z') {
                                ch[i] -= 26;
                            }
                        } else {
                            ch[i] += n;
                            if (ch[i] > 'Z') {
                                ch[i] -= 26;
                            }
                        }
                    }
                    answer.append(ch[i]);
                }

                return answer.toString();
            }
        }
    }
}
