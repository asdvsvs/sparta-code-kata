package org.sparta.programmers.pro_LV1;

import java.util.HashMap;
import java.util.Map;

public class PersonalityTypes {
    public static void main(String[] args) {
        class Solution {
            public String solution(String[] survey, int[] choices) {
                String answer = "";
                String[] s = {"R", "T", "C", "F", "J", "M", "A", "N"};
                Map<String, Integer> map = new HashMap<>();

                for (int i = 0; i < survey.length; i++) {
                    if (choices[i] == 4) {
                        continue;
                    } else if (choices[i] < 4) {
                        map.put(survey[i].substring(0, 1), map.getOrDefault(survey[i].substring(0, 1), 0) + (choices[i] - 4) * -1);
                    } else if (choices[i] > 4) {
                        map.put(survey[i].substring(1), map.getOrDefault(survey[i].substring(1), 0) + choices[i] - 4);
                    }
                }

                for (int i = 0; i < s.length; i += 2) {
                    if (map.getOrDefault(s[i], 0) >= map.getOrDefault(s[i + 1], 0)) {
                        answer = answer + s[i];
                    } else {
                        answer = answer + s[i + 1];
                    }
                }

                return answer;
            }
        }
    }
}
