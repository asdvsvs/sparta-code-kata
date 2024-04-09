package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/42578

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pro_42578 {
    public static void main(String[] args) {
        class Solution {
            static int answer = 0;

            public int solution(String[][] clothes) {
                Map<String, Integer> map = new HashMap<>();

                for (String[] arr : clothes) {
                    map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
                }

                List<Integer> list = new ArrayList<>(map.values());
                dfs(list, 0, 1);

                return answer;
            }

            void dfs(List<Integer> list, int depth, int multi) {
                if (depth == list.size()) {
                    return;
                }

                for (int i = depth; i < list.size(); i++) {
                    answer += multi * list.get(i);
                    // System.out.println(depth+", "+i +", "+list.get(i)+", "+ multi);
                    dfs(list, i + 1, multi * list.get(i));
                }
            }
        }
    }
}
