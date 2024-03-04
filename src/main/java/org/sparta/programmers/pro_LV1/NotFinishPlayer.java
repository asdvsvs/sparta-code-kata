package org.sparta.programmers.pro_LV1;

import java.util.HashMap;
import java.util.Map;

public class NotFinishPlayer {
    public static void main(String[] args) {
        class Solution {
            public String solution(String[] participant, String[] completion) {
                String answer = "";

                Map<String, Integer> map = new HashMap<>();

                for (String s : participant) {
                    map.put(s, map.getOrDefault(s, 0) + 1);
                }

                for (String s : completion) {
                    map.put(s, map.get(s) - 1);
                    if (map.get(s) == 0) {
                        map.remove(s);
                    }
                }

                answer = map.keySet().stream().findFirst().get();

                return answer;
            }
        }
    }
}
