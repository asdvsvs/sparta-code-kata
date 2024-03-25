package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12939
public class MaxMin {
    public static void main(String[] args) {
        class Solution {
            public String solution(String s) {
                String answer = "";
                String[] arr = s.split(" ");
                int max = Integer.parseInt(arr[0]);
                int min = Integer.parseInt(arr[0]);

                for (String a : arr) {
                    max = Math.max(max, Integer.parseInt(a));
                    min = Math.min(min, Integer.parseInt(a));
                }
                answer = min + " " + max;

                return answer;
            }
        }
    }
}
