package org.sparta.programmers.pro_LV0;

public class AlienDictionaries {
    public static void main(String[] args) {
        class Solution {
            public int solution(String[] spell, String[] dic) {
                int answer = 2;

                loop:
                for (String s : dic) {
                    if (s.length() == spell.length) {
                        for (String str : spell) {
                            if (!s.contains(str)) {
                                continue loop;
                            }
                        }
                        answer = 1;
                        break;
                    }
                }

                return answer;
            }
        }
    }
}
