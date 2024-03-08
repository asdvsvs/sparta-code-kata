package org.sparta.programmers.pro_LV1;

import java.util.HashMap;
import java.util.Map;

public class RoughlyVending {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(String[] keymap, String[] targets) {
                int[] answer = new int[targets.length];
                Map<Character, Integer> map = new HashMap<>();

                for (String s : keymap) {
                    for (int i = 0; i < s.length(); i++) {
                        if (map.get(s.charAt(i)) == null) {
                            map.put(s.charAt(i), i + 1);
                        } else {
                            if (map.get(s.charAt(i)) > i + 1) {
                                map.put(s.charAt(i), i + 1);
                            }
                        }
                    }
                }

                for (int i = 0; i < targets.length; i++) {
                    for (int j = 0; j < targets[i].length(); j++) {
                        if (map.get(targets[i].charAt(j)) == null) {
                            answer[i] = -1;
                            break;
                        }
                        answer[i] += map.get(targets[i].charAt(j));
                    }
                }

                return answer;
            }
        }
    }
}
