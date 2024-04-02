package org.sparta.programmers.pro_LV0;

//https://school.programmers.co.kr/learn/courses/30/lessons/181895

import java.util.ArrayList;
import java.util.List;

public class CreateArray3 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] arr, int[][] intervals) {
                List<Integer> list = new ArrayList<>();

                for (int[] iarr : intervals) {
                    for (int i = iarr[0]; i <= iarr[1]; i++) {
                        list.add(arr[i]);
                    }
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
