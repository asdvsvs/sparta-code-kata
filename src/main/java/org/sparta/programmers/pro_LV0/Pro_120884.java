package org.sparta.programmers.pro_LV0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120884
public class Pro_120884 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int chicken) {
                int answer = 0;

                for (int i = 10; i <= chicken; i += 10) {
                    answer++;
                    chicken++;
                }

                return answer;
            }
        }
    }
}
