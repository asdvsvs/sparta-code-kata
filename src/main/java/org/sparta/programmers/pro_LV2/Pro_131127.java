package org.sparta.programmers.pro_LV2;

import java.util.HashMap;
import java.util.Map;

public class Pro_131127 {
    public static void main(String[] args) {
        class Solution {
            public int solution(String[] want, int[] number, String[] discount) {
                int answer = 0;
                Map<String, Integer> map = new HashMap<>();
                for (int i = 0; i < want.length; i++) {
                    map.put(want[i], i);
                }

                for (int i = 0; i <= discount.length - 10; i++) {
                    int[] cnt = new int[want.length];
                    for (int j = i; j < i + 10; j++) {
                        if (map.get(discount[j]) != null) {
                            cnt[map.get(discount[j])]++;
                        }
                    }
                    boolean bool = true;
                    for (int j = 0; j < cnt.length; j++) {
                        if (cnt[j] != number[j]) {
                            bool = false;
                            break;
                        }
                    }
                    if (bool) {
                        answer++;
                    }
                }

                return answer;
            }
        }
    }
}
