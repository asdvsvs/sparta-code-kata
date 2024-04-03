package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/64065

import java.util.HashSet;
import java.util.Set;

public class Tuples {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(String s) {
                String[] arr = s.split("}");
                int[] answer = new int[arr.length];
                String minstr = "";
                Set<String> set = new HashSet<>();
                int cnt = 0;

                for (int j = 0; j < arr.length; j++) {
                    int min = s.length();
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i].length() != 0 && arr[i].length() < min) {
                            min = arr[i].length();
                            minstr = arr[i];
                        }
                    }
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i].equals(minstr)) {
                            arr[i] = "";
                        }
                    }

                    minstr = minstr.replace("{", "");
                    String[] arr2 = minstr.split(",");
                    for (String str : arr2) {
                        if (!str.equals("")) {
                            if (!set.contains(str)) {
                                set.add(str);
                                answer[cnt] = Integer.parseInt(str);
                                cnt++;
                            }
                        }
                    }
                }

                return answer;
            }
        }
    }
}
