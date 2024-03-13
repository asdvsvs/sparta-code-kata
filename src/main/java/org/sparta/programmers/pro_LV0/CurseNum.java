package org.sparta.programmers.pro_LV0;

public class CurseNum {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {

                for (int i = 1; i <= n; i++) {
                    if (i % 3 == 0) {
                        n++;
                    } else {
                        String s = String.valueOf(i);
                        char[] ch = s.toCharArray();
                        for (char c : ch) {
                            if (c == '3') {
                                n++;
                                break;
                            }
                        }
                    }
                }

                return n;
            }
        }
    }
}
