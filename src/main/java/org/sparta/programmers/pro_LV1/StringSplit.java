package org.sparta.programmers.pro_LV1;

public class StringSplit {
    public static void main(String[] args) {
        class Solution {
            public int solution(String s) {
                int answer = 0;
                char x = '0';
                int cnt1 = 0;
                int cnt2 = 0;
                char[] ch = s.toCharArray();

                for (char c : ch) {
                    if (x == '0' || x == c) {
                        x = c;
                        cnt1++;
                    } else {
                        cnt2++;
                    }

                    if (cnt1 == cnt2) {
                        answer++;
                        x = '0';
                        cnt1 = 0;
                        cnt2 = 0;
                    }
                }
                if (cnt1 != cnt2) {
                    answer++;
                }

                return answer;
            }
        }
    }
}
