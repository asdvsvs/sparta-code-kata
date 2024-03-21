package org.sparta.programmers.pro_LV0;

//https://school.programmers.co.kr/learn/courses/30/lessons/181916

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DiceGame3 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int a, int b, int c, int d) {
                int answer = 0;
                int p = 0;
                int q = 0;
                int r = 0;
                Map<Integer, Integer> map = new HashMap<>();
                int[] num = {a, b, c, d};

                for (int i : num) {
                    map.put(i, map.getOrDefault(i, 0) + 1);
                }

                if (map.size() == 1) {
                    answer = 1111 * a;
                } else if (map.size() == 3) {
                    for (int i : map.keySet()) {
                        if (map.get(i) == 1) {
                            if (q == 0) {
                                q = i;
                            } else {
                                r = i;
                            }
                        }
                    }
                    answer = q * r;
                } else if (map.size() == 4) {
                    Arrays.sort(num);
                    answer = num[0];
                } else {
                    if (map.get(a) != 2) {
                        for (int i : map.keySet()) {
                            if (map.get(i) == 3) {
                                p = i;
                            } else {
                                q = i;
                            }
                        }
                        answer = (10 * p + q) * (10 * p + q);
                    } else {
                        for (int i : map.keySet()) {
                            if (p == 0) {
                                p = i;
                            } else {
                                q = i;
                            }
                        }
                        answer = (p + q) * Math.abs(p - q);
                    }
                }

                return answer;
            }
        }
    }
}
