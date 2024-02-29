package org.sparta.programmers.pro_LV0;

import java.util.HashSet;
import java.util.Set;

public class Babbling1 {
    public static void main(String[] args) {
        class Solution {
            public int solution(String[] babbling) {
                int answer = 0;

                Set<String> set = new HashSet<>();
                set.add("aya");
                set.add("ye");
                set.add("woo");
                set.add("ma");

                for (int i = 0; i < babbling.length; i++) {
                    loop:
                    while (true) {
                        if (babbling[i].length() > 1 && set.contains(babbling[i].substring(0, 2))) {
                            babbling[i] = babbling[i].replace(babbling[i].substring(0, 2), "");
                        } else if (babbling[i].length() > 2 && set.contains(babbling[i].substring(0, 3))) {
                            babbling[i] = babbling[i].replace(babbling[i].substring(0, 3), "");
                        } else break loop;
                    }
                }
                for (String s : babbling) {
                    if (s.equals("")) {
                        answer++;
                    }
                }

                return answer;
            }
        }
    }
}
