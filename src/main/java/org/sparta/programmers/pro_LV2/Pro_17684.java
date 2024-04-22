package org.sparta.programmers.pro_LV2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pro_17684 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(String msg) {
                List<Integer> list = new ArrayList<>();
                String[] dictionary = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
                Map<String, Integer> map = new HashMap<>();
                for (int i = 0; i < dictionary.length; i++) {
                    map.put(dictionary[i], i + 1);
                }

                for (int i = 0; i < msg.length(); i++) {
                    int c = 1;

                    while (true) {
                        if (map.containsKey(msg.substring(i, i + c))) {
                            c++;
                            if (i + c > msg.length()) {
                                list.add(map.get(msg.substring(i, i + c - 1)));
                                i += c - 2;
                                break;
                            }
                        } else {
                            list.add(map.get(msg.substring(i, i + c - 1)));
                            if (i + c <= msg.length()) {
                                map.put(msg.substring(i, i + c), map.size() + 1);
                            }
                            i += c - 2;
                            break;
                        }
                    }
                }


                int[] answer = new int[list.size()];
                for (int i = 0; i < answer.length; i++) {
                    answer[i] = list.get(i);
                }
                return answer;
            }
        }
    }
}
