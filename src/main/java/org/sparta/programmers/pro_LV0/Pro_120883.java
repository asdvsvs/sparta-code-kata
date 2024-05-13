package org.sparta.programmers.pro_LV0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120883

import java.util.HashMap;
import java.util.Map;

public class Pro_120883 {
    public static void main(String[] args) {
        class Solution {
            public String solution(String[] id_pw, String[][] db) {
                String answer = "";

                Map<String, String> map = new HashMap<>();
                for (String[] arr : db) {
                    map.put(arr[0], arr[1]);
                }

                if (map.containsKey(id_pw[0])) {
                    if (id_pw[1].equals(map.get(id_pw[0]))) {
                        answer = "login";
                    } else {
                        answer = "wrong pw";
                    }
                } else {
                    answer = "fail";
                }

                return answer;
            }
        }
    }
}
