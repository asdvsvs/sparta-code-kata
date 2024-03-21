package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/42748

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KNum {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] array, int[][] commands) {
                int[] answer = new int[commands.length];
                for (int j = 0; j < commands.length; j++) {
                    List<Integer> list = new ArrayList<>();
                    for (int i = commands[j][0] - 1; i < commands[j][1]; i++) {
                        list.add(array[i]);
                    }
                    Collections.sort(list);
                    answer[j] = list.get(commands[j][2] - 1);
                }

                return answer;
            }
        }
    }
}
