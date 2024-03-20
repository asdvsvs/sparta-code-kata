package org.sparta.programmers.pro_LV0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120875

import java.util.ArrayList;
import java.util.List;

public class Parallel {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[][] dots) {
                int answer = 0;

                for (int j = 1; j < dots.length; j++) {
                    List<Integer> list = new ArrayList<>(List.of(1, 2, 3));
                    list.remove(Integer.valueOf(j));
                    int x1 = dots[0][0] - dots[j][0];
                    int y1 = dots[0][1] - dots[j][1];
                    int x2 = dots[list.get(0)][0] - dots[list.get(1)][0];
                    int y2 = dots[list.get(0)][1] - dots[list.get(1)][1];
                    if ((float) x1 / y1 == (float) x2 / y2) {
                        answer = 1;
                        break;
                    }
                }
                return answer;
            }
        }
    }
}
