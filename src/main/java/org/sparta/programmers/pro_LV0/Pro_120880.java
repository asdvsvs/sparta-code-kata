package org.sparta.programmers.pro_LV0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120880

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pro_120880 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] numlist, int n) {
                List<Integer> list = new ArrayList<>();
                Set<Integer> set = new HashSet<>();
                for (int i : numlist) {
                    set.add(i);
                }

                for (int i = 0; i < 10000; i++) {
                    if (set.contains(n + i)) {
                        list.add(n + i);
                    }
                    if (i != 0 && set.contains(n - i)) {
                        list.add(n - i);
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
