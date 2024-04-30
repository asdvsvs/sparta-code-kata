package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12981

import java.util.HashSet;
import java.util.Set;

public class Pro_12981 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int n, String[] words) {
                int[] answer = new int[2];

                Set<String> set = new HashSet<>();
                char temp = words[0].charAt(0);
                for (int i = 0; i < words.length; i++) {
                    if (set.contains(words[i])) {
                        answer[0] = i % n + 1;
                        answer[1] = i / n + 1;
                        break;
                    } else if (temp != words[i].charAt(0)) {
                        answer[0] = i % n + 1;
                        answer[1] = i / n + 1;
                        break;
                    } else {
                        set.add(words[i]);
                        temp = words[i].charAt(words[i].length() - 1);
                    }
                }

                return answer;
            }
        }
    }
}
