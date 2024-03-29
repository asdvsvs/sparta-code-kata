package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/84512
public class VowelDictionary {
    public static void main(String[] args) {
        class Solution {
            public int solution(String word) {
                int answer = 0;
                String[] w = {"A", "E", "I", "O", "U"};

                loop:
                for (String w1 : w) {
                    answer++;
                    String s1 = w1;
                    if (word.equals(s1)) {
                        break loop;
                    }
                    for (String w2 : w) {
                        answer++;
                        String s2 = w1 + w2;
                        if (word.equals(s2)) {
                            break loop;
                        }
                        for (String w3 : w) {
                            answer++;
                            String s3 = w1 + w2 + w3;
                            if (word.equals(s3)) {
                                break loop;
                            }
                            for (String w4 : w) {
                                answer++;
                                String s4 = w1 + w2 + w3 + w4;
                                if (word.equals(s4)) {
                                    break loop;
                                }
                                for (String w5 : w) {
                                    answer++;
                                    String s5 = w1 + w2 + w3 + w4 + w5;
                                    if (word.equals(s5)) {
                                        break loop;
                                    }
                                }
                            }
                        }
                    }
                }

                return answer;
            }
        }
    }
}
