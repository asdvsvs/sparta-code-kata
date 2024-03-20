package org.sparta.programmers.pro_LV2;
//https://school.programmers.co.kr/learn/courses/30/lessons/42839

import java.util.HashSet;
import java.util.Set;

public class FindSosuLv2 {

    public static void main(String[] args) {
        class Solution {
            static int answer = 0;
            static Set<String> set = new HashSet<>();

            public int solution(String numbers) {

                boolean[] bool = new boolean[numbers.length()];
                f(numbers, "", bool, 0);

                loop:
                for (String s : set) {
                    int a = Integer.parseInt(s);
                    if (a == 1) {
                        continue;
                    }
                    for (int j = 2; j * j <= a; j++) {
                        if (a % j == 0) {
                            continue loop;
                        }
                    }
                    answer++;
                }

                return answer;
            }

            public static void f(String numbers, String str, boolean[] bool, int depth) {
                if (depth == numbers.length()) {
                    return;
                }

                for (int i = 0; i < numbers.length(); i++) {
                    if (!bool[i]) {
                        bool[i] = true;
                        str = str + numbers.charAt(i);
                        if (str.startsWith("0")) {
                            str = str.substring(1);
                        }
                        if (!str.equals("")) {
                            set.add(str);
                        }
                        f(numbers, str, bool, depth + 1);
                        bool[i] = false;
                        if (str.length() > 0) {
                            str = str.substring(0, str.length() - 1);
                        }
                    }
                }
            }
        }
    }
}
