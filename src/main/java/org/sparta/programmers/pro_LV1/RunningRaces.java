package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/178871

import java.util.HashMap;
import java.util.Map;

public class RunningRaces {
    public static void main(String[] args) {
        class Solution {
            public String[] solution(String[] players, String[] callings) {
                Map<String, Integer> map = new HashMap<>();

                for (int i = 0; i < players.length; i++) {
                    map.put(players[i], i);
                }

                for (String s : callings) {
                    int idx = map.get(s);

                    String str = players[idx];
                    players[idx] = players[idx - 1];
                    players[idx - 1] = str;

                    map.put(players[idx], idx);
                    map.put(players[idx - 1], idx - 1);

                }

                String[] answer = players;

                return answer;
            }
        }
    }
}
