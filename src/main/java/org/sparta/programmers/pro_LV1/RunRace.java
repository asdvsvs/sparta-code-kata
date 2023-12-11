package org.sparta.programmers.pro_LV1;

import java.util.HashMap;
import java.util.Map;

public class RunRace {

    public static void main(String[] args) {

        class Solution {

            public String[] solution(String[] players, String[] callings) {
                String[] answer = {};
                Map<String, Integer> playerMap = new HashMap<>();
                for (int i = 0; i < players.length; i++) {
                    playerMap.put(players[i], i + 1);
                }
                for (String s : callings) {
                    String temp = players[(playerMap.get(s) - 2)];
                    players[(playerMap.get(s) - 2)] = players[playerMap.get(s) - 1];
                    players[(playerMap.get(s) - 1)] = temp;

                    playerMap.put(temp,playerMap.get(temp)+1);
                    playerMap.put(s, playerMap.get(s) - 1);
                }
                answer=players;
                return answer;
            }
        }
    }
}
