package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/138476

import java.util.*;

public class Pro_138476 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int k, int[] tangerine) {
                int answer = 0;
                Map<Integer, Integer> map1 = new HashMap<>();
                Map<Integer, Integer> map2 = new HashMap<>();
                int cnt = 0;
                int num = k;

                for (int i : tangerine) {
                    map1.put(i, map1.getOrDefault(i, 0) + 1);
                }
                for (int i : map1.values()) {
                    map2.put(i, map2.getOrDefault(i, 0) + 1);
                }

                List<Integer> list = new ArrayList<>(map2.keySet());
                Collections.sort(list);
                int len = list.size() - 1;

                loop:
                while (cnt < num) {
                    int t = list.get(len);
                    if (map2.containsKey(t)) {
                        for (int i = 0; i < map2.get(t); i++) {
                            cnt += t;
                            answer++;
                            if (cnt >= num) {
                                break loop;
                            }
                        }
                    }
                    len--;
                }

                return answer;
            }
        }
    }
}
