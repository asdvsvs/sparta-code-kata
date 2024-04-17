package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/42586

import java.util.ArrayList;
import java.util.List;

public class Pro_42586 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] progresses, int[] speeds) {
                List<Integer> list = new ArrayList<>();
                int[] days = new int[progresses.length];

                for (int i = 0; i < progresses.length; i++) {
                    days[i] = (100 - progresses[i]) / speeds[i];
                    if ((100 - progresses[i]) % speeds[i] != 0) {
                        days[i]++;
                    }
                }

                for (int i = 0; i < progresses.length; i++) {
                    int cnt = 1;
                    for (int j = i + 1; j < progresses.length; j++) {
                        if (days[i] >= days[j]) {
                            cnt++;
                        } else {
                            break;
                        }
                    }
                    list.add(cnt);
                    i += cnt - 1;
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
