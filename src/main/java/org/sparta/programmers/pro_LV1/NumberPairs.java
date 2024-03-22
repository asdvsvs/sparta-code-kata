package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/131128

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberPairs {
    public static void main(String[] args) {
        class Solution {
            public String solution(String X, String Y) {
                StringBuilder answer = new StringBuilder();
                char[] arrX = X.toCharArray();
                char[] arrY = Y.toCharArray();
                Map<Character, Integer> map = new HashMap<>();

                for (char c : arrY) {
                    map.put(c, map.getOrDefault(c, 0) + 1);
                }
                Arrays.sort(arrX);
                for (int i = arrX.length - 1; i >= 0; i--) {
                    if (map.get(arrX[i]) != null) {
                        if (map.get(arrX[i]) > 1) {
                            map.put(arrX[i], map.get(arrX[i]) - 1);
                        } else {
                            map.remove(arrX[i]);
                        }
                        answer.append(arrX[i]);
                    }
                }

                if (answer.substring(0).startsWith("0")) {
                    answer = new StringBuilder("0");
                }
                if (answer.substring(0).equals("")) {
                    answer.append("-1");
                }

                return answer.toString();
            }
        }
    }
}
