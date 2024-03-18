package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12910

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleNum {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] arr, int divisor) {
                List<Integer> list = new ArrayList<>();
                Arrays.sort(arr);

                for (int i : arr) {
                    if (i % divisor == 0) {
                        list.add(i);
                    }
                }
                int[] answer;
                if (list.size() == 0) {
                    answer = new int[1];
                    answer[0] = -1;
                } else {
                    answer = new int[list.size()];
                    for (int i = 0; i < answer.length; i++) {
                        answer[i] = list.get(i);
                    }
                }

                return answer;
            }
        }
    }
}
