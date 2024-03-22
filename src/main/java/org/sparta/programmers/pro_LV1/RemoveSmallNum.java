package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12935

import java.util.ArrayList;
import java.util.List;

public class RemoveSmallNum {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] arr) {
                List<Integer> list = new ArrayList<>();
                int min = arr[0];
                for (int i : arr) {
                    min = Math.min(min, i);
                }
                for (int i : arr) {
                    if (i == min) {
                        continue;
                    }
                    list.add(i);
                }
                if (list.size() == 0) {
                    list.add(-1);
                }
                int[] answer = new int[list.size()];
                for (int i = 0; i < answer.length; i++) {
                    answer[i] = list.get(i);
                }
                return answer;
            }
        }
    }
}
