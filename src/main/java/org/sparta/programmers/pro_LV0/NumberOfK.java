package org.sparta.programmers.pro_LV0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120887
public class NumberOfK {
    public static void main(String[] args) {
        class Solution {
            public int solution(int i, int j, int k) {
                int answer = 0;

                for (int a = i; a <= j; a++) {
                    String s = String.valueOf(a);
                    char[] ch = s.toCharArray();
                    for (char c : ch) {
                        if (String.valueOf(c).equals(String.valueOf(k))) {
                            answer++;
                        }
                    }
                }

                return answer;
            }
        }
    }
}
