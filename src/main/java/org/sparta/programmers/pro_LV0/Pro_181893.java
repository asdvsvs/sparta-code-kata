package org.sparta.programmers.pro_LV0;
//https://school.programmers.co.kr/learn/courses/30/lessons/181893#
//https://school.programmers.co.kr/questions/75701

import java.util.ArrayList;
import java.util.List;

public class Pro_181893 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] arr, int[] query) {
                List<Integer> list = new ArrayList<>();
                for (int i : arr) {
                    list.add(i);
                }

                for (int i = 0; i < query.length; i++) {
                    if (i % 2 == 0) {
                        int temp = list.size();
                        for (int j = query[i] + 1; j < temp; j++) {
                            list.remove(list.size() - 1);
                        }
                    } else {
                        for (int j = 0; j < query[i]; j++) {
                            list.remove(0);
                        }
                    }
                }

                int[] answer = new int[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    answer[i] = list.get(i);
                }

                return answer;
            }
        }
    }
}
