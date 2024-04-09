package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12911
public class Pro_12911 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                int answer = 0;
                String s = Integer.toBinaryString(n);
                int sCnt = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '1') {
                        sCnt++;
                    }
                }

                while (true) {
                    n++;
                    String s1 = Integer.toBinaryString(n);
                    int s1Cnt = 0;
                    for (int i = 0; i < s1.length(); i++) {
                        if (s1.charAt(i) == '1') {
                            s1Cnt++;
                        }
                    }
                    if (sCnt == s1Cnt) {
                        answer = n;
                        break;
                    }
                }


                return answer;
            }
        }
    }
}
