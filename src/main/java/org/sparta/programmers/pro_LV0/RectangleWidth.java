package org.sparta.programmers.pro_LV0;

import java.util.HashSet;
import java.util.Set;

public class RectangleWidth {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[][] dots) {
                int answer = 1;

                Set<Integer> x = new HashSet<>();
                Set<Integer> y = new HashSet<>();
                int temp = 1000;

                for (int i = 0; i < dots.length; i++) {
                    x.add(dots[i][0]);
                    y.add(dots[i][1]);
                }

                for (int i : x) {
                    if (temp == 1000) {
                        temp = i;
                    } else {
                        answer *= Math.abs(temp - i);
                        temp = 1000;
                    }
                }

                for (int i : y) {
                    if (temp == 1000) {
                        temp = i;
                    } else {
                        answer *= Math.abs(temp - i);
                    }
                }

                return answer;
            }
        }
    }
}
