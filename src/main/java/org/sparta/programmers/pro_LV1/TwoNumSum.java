package org.sparta.programmers.pro_LV1;

import java.util.*;

public class TwoNumSum {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] numbers) {
                Set<Integer> set = new HashSet<>();

                for (int i = 0; i < numbers.length; i++) {
                    for (int j = i + 1; j < numbers.length; j++) {
                        set.add(numbers[i] + numbers[j]);
                    }
                }

                List<Integer> list = new ArrayList<>();
                for (int i : set) {
                    list.add(i);
                }
                Collections.sort(list);

                int[] answer = new int[list.size()];
                for (int i = 0; i < answer.length; i++) {
                    answer[i] = list.get(i);
                }

                return answer;
            }
        }
    }
}
