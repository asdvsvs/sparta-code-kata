package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12947
public class HashadNum {
    public static void main(String[] args) {
        class Solution {
            public boolean solution(int x) {
                boolean answer = true;
                int sum = 0;

                char[] c = String.valueOf(x).toCharArray();
                for (char ch : c) {
                    sum += Integer.parseInt(String.valueOf(ch));
                }
                if (x % sum != 0) {
                    answer = false;
                }

                return answer;
            }
        }
    }
}
