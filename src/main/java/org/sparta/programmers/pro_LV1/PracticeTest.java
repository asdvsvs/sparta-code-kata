package org.sparta.programmers.pro_LV1;

import java.util.ArrayList;
import java.util.List;

public class PracticeTest {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] answers) {
                int[][] p = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
                int[] cnt = new int[3];

                for (int i = 0; i < answers.length; i++) {
                    for (int j = 0; j < p.length; j++) {
                        if (answers[i] == p[j][i % p[j].length]) {
                            cnt[j]++;
                        }
                    }
                }

                int max = 0;
                for (int i : cnt) {
                    max = Math.max(max, i);
                }
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < cnt.length; i++) {
                    if (cnt[i] == max) {
                        list.add(i + 1);
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
