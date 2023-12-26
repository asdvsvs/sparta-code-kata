package org.sparta.programmers.lv4;

import java.util.HashMap;
import java.util.Map;

public class Discount {

    public static void main(String[] args) {
        class Solution {

            public int solution(String[] want, int[] number, String[] discount) {
                int answer = 0;

                Map<String, Integer> wantMap = new HashMap<>();

                for (int j = 0; j <= discount.length - 10; j++) {
                    for (String s : want) {
                        wantMap.put(s, 0);
                    }
                    for (int i = j; i < j + 10; i++) {
                        if (wantMap.containsKey(discount[i])) {
                            wantMap.put(discount[i], wantMap.get(discount[i]) + 1);
                        }
                    }

                    for (int i = 0; i < number.length; i++) {
                        if (number[i] != wantMap.get(want[i])) {
                            break;
                        }
                        if (i == number.length - 1) {
                            answer++;
                        }
                    }
                }

                return answer;
            }
        }
    }

}
