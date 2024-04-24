package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12980
public class Pro_12980 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                int ans = 0;

                String s = Integer.toBinaryString(n);
                s = s.replace("0", "");
                ans = s.length();

                return ans;
            }
        }
    }
}
