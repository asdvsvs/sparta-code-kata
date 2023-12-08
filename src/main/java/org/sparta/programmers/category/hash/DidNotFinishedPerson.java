package org.sparta.programmers.category.hash;


import java.util.HashMap;
import java.util.Map;

public class DidNotFinishedPerson {

    public static void main(String[] args) {
        class Solution {

            public String solution(String[] participant, String[] completion) {
                String answer = "";

                Map<String, Integer> map = new HashMap<>();
                for (String s : participant) {
                    if (map.get(s) == null) {
                        map.put(s, 1);
                    } else {
                        map.put(s, map.get(s) + 1);
                    }
                }
                for (String s : completion) {
                    map.put(s, map.get(s) - 1);
                }

                for (String s : participant) {
                    if (map.get(s) == 1) {
                        answer = s;
                    }
                }
                return answer;
            }
        }


    }
}
