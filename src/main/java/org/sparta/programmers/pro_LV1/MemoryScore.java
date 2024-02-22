package org.sparta.programmers.pro_LV1;

import java.util.HashMap;
import java.util.Map;

public class MemoryScore {

    public static void main(String[] args) {
        class Solution {

            public int[] solution(String[] name, int[] yearning, String[][] photo) {
                int[] answer = new int[photo.length];
                int cnt = 0;

                Map<String, Integer> map = new HashMap<>();
                for (int i = 0; i < name.length; i++) {
                    map.put(name[i], yearning[i]);
                }

                for (String[] sArr : photo) {
                    int temp = 0;
                    for (String s : sArr) {
                        if (map.get(s) != null) {
                            temp += map.get(s);
                        }
                    }
                    answer[cnt++] = temp;
                }

                return answer;
            }
        }
    }
}
