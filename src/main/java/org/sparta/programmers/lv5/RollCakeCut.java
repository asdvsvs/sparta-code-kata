package org.sparta.programmers.lv5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RollCakeCut {

    public static void main(String[] args) {
        class Solution {

            public int solution(int[] topping) {
                int answer = 0;
                Set<Integer> bigbro = new HashSet<>();
                Map<Integer, Integer> map = new HashMap<>();

                for (int i : topping) {
                    if (map.get(i) == null) {
                        map.put(i, 1);
                    } else {
                        map.put(i, map.get(i) + 1);
                    }
                }

                for (int i = 0; i < topping.length; i++) {
                    bigbro.add(topping[i]);
                    if (map.get(topping[i]) != null) {
                        map.put(topping[i], map.get(topping[i]) - 1);
                        if (map.get(topping[i]) == 0) {
                            map.remove(topping[i]);
                        }
                    }
                    if (bigbro.size() == map.size()) {
                        answer++;
                    }
                }

                return answer;
            }
        }
    }
}
