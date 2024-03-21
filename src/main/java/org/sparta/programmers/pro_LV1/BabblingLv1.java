package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/133499#
public class BabblingLv1 {
    public static void main(String[] args) {
        class Solution {
            public int solution(String[] babbling) {
                int answer = 0;
                String[] str = {"aya", "ye", "woo", "ma"};

                for (int i = 0; i < babbling.length; i++) {
                    int prev = -1;
                    for (int j = 0; j < str.length; j++) {
                        if (prev != j && babbling[i].startsWith(str[j])) {
                            babbling[i] = babbling[i].substring(str[j].length());
                            prev = j;
                            j = -1;
                        }
                    }
                    if (babbling[i].equals("")) {
                        answer++;
                    }
                }
                return answer;
            }
        }
    }
}
