package org.sparta.programmers.pro_LV1;

import java.util.ArrayList;
import java.util.List;

public class LottosRanking {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] lottos, int[] win_nums) {
                int[] answer = new int[2];

                List<Integer> win_list = new ArrayList<>();
                for (int i : win_nums) {
                    win_list.add(i);
                }

                for (int i : lottos) {
                    if (win_list.contains(i)) {
                        answer[1]++;
                    }
                    if (i == 0) {
                        answer[0]++;
                    }
                }
                answer[0] += answer[1];

                for (int i = 0; i < answer.length; i++) {
                    if (answer[i] == 2) answer[i] = 5;
                    else if (answer[i] == 3) answer[i] = 4;
                    else if (answer[i] == 4) answer[i] = 3;
                    else if (answer[i] == 5) answer[i] = 2;
                    else if (answer[i] == 6) answer[i] = 1;
                    else answer[i] = 6;
                }

                return answer;
            }
        }
    }
}
