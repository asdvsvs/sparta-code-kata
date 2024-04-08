package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/42577

import java.util.HashSet;
import java.util.Set;

public class Pro_42577 {
    public static void main(String[] args) {
        class Solution {
            public boolean solution(String[] phone_book) {
                boolean answer = true;

                Set<String> set = new HashSet<>();
                for (String s : phone_book) {
                    set.add(s);
                }

                for (String s : phone_book) {
                    for (int j = 1; j < s.length(); j++) {
                        if (set.contains(s.substring(0, j))) {
                            return false;
                        }
                    }
                }

                return answer;
            }
        }
    }
}
