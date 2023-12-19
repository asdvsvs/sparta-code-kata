package org.sparta.programmers.lv4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SelectTangerine {

    public static void main(String[] args) {
        class Solution {

            public int solution(int k, int[] tangerine) {
                int answer = 0;
                int count = 0;
                Map<Integer, Integer> map = new HashMap<>();
                for (int i = 0; i < tangerine.length; i++) {
                    if (map.get(tangerine[i]) == null) {
                        map.put(tangerine[i], 0);
                    }
                    map.put(tangerine[i], map.get(tangerine[i]) + 1);
                }
                List<Integer> list = new ArrayList<>();
                list.addAll(map.values());
                Collections.sort(list);
                int index = list.size() - 1;
                for (int i = 0; i < tangerine.length; i++) {
                    count++;
                    answer += list.get(index - i);
                    if (answer >= k) {
                        answer = count;
                        break;
                    }
                }
                return answer;
            }
        }
    }

}
