package org.sparta.programmers.pro_LV1;

import java.util.ArrayList;
import java.util.List;

public class NearestLetter {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(String s) {
                int[] answer = new int[s.length()];
                char[] ch = s.toCharArray();
                List<Character> list = new ArrayList<>();

                for (int i = 0; i < ch.length; i++) {
                    if (!list.contains(ch[i])) {
                        answer[i] = -1;
                    } else {
                        answer[i] = i - list.lastIndexOf(ch[i]);
                    }
                    list.add(ch[i]);
                }

                return answer;
            }
        }
    }
}
