package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/17682
public class DartGame {
    public static void main(String[] args) {
        class Solution {
            public int solution(String dartResult) {
                int answer = 0;

                String[] dart = {"", "", ""};
                int[] score = new int[3];
                int n = 0;
                int size = 0;

                for (int i = 0; i < dartResult.length(); i++) {
                    if (size > 1 && dartResult.charAt(i) >= 48 && dartResult.charAt(i) <= 57) {
                        dart[++n] += dartResult.charAt(i);
                        size = 1;
                    } else {
                        dart[n] += dartResult.charAt(i);
                        size++;
                    }
                }

                for (int i = 0; i < dart.length; i++) {
                    score[i] = 1;
                    int num;
                    int cnt = 0;
                    if (dart[i].charAt(1) == '0') {
                        num = Integer.parseInt(dart[i].substring(0, 2));
                        dart[i] = dart[i].substring(2);
                    } else {
                        num = Integer.parseInt(dart[i].substring(0, 1));
                        dart[i] = dart[i].substring(1);
                    }

                    if (dart[i].charAt(0) == 'S') {
                        cnt = 1;
                    } else if (dart[i].charAt(0) == 'D') {
                        cnt = 2;
                    } else if (dart[i].charAt(0) == 'T') {
                        cnt = 3;
                    }

                    for (int j = 0; j < cnt; j++) {
                        score[i] *= num;
                    }

                    if (dart[i].charAt(dart[i].length() - 1) == '*') {
                        if (i != 0) {
                            score[i - 1] *= 2;
                            score[i] *= 2;
                        } else {
                            score[i] *= 2;
                        }
                    } else if (dart[i].charAt(dart[i].length() - 1) == '#') {
                        score[i] *= -1;
                    }
                }

                for (int i : score) {
                    answer += i;
                }

                return answer;
            }
        }
    }
}
