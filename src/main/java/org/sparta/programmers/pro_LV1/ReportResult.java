package org.sparta.programmers.pro_LV1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ReportResult {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(String[] id_list, String[] report, int k) {
                int[] answer = new int[id_list.length];

                Map<String, Set<String>> map = new HashMap<>();
                for (String s : id_list) {
                    map.put(s, new HashSet<>());
                }

                for (String s : report) {
                    String[] str = s.split(" ");
                    map.get(str[1]).add(str[0]);
                    // map.put(str[1], map.get(str[1]));
                }

                for (int i = 0; i < id_list.length; i++) {
                    if (map.get(id_list[i]).size() >= k) {
                        for (String s : map.get(id_list[i])) {
                            for (int j = 0; j < id_list.length; j++) {
                                if (s.equals(id_list[j])) {
                                    answer[j]++;
                                    break;
                                }
                            }
                        }
                    }
                }

                return answer;
            }
        }
    }
}
