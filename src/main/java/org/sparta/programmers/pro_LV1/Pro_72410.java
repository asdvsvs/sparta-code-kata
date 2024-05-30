package org.sparta.programmers.pro_LV1;
//https://school.programmers.co.kr/learn/courses/30/lessons/72410#

import java.util.HashSet;
import java.util.Set;

public class Pro_72410 {
    public static void main(String[] args) {
        class Solution {
            public String solution(String new_id) {
                String answer = "";
                Set<String> set = new HashSet<>();
                for (int i = 97; i <= 122; i++) {
                    set.add(String.valueOf((char) i));
                }
                for (int i = 0; i <= 9; i++) {
                    set.add(String.valueOf(i));
                }
                set.add("-");
                set.add("_");
                set.add(".");

                //1
                new_id = new_id.toLowerCase();
                //2
                for (int i = 0; i < new_id.length(); i++) {
                    if (set.contains(String.valueOf(new_id.charAt(i)))) {
                        answer += new_id.charAt(i);
                    }
                }
                //3
                while (true) {
                    String temp = answer;
                    answer = answer.replace("..", ".");
                    if (temp.equals(answer)) {
                        break;
                    }
                }
                //4
                if (answer.charAt(0) == '.') {
                    answer = answer.substring(1, answer.length());
                }
                if (answer.length() > 0 && answer.charAt(answer.length() - 1) == '.') {
                    answer = answer.substring(0, answer.length() - 1);
                }
                //5
                if (answer.equals("")) {
                    answer = "a";
                }
                //6
                if (answer.length() >= 16) {
                    answer = answer.substring(0, 15);
                    if (answer.charAt(answer.length() - 1) == '.') {
                        answer = answer.substring(0, answer.length() - 1);
                    }
                }
                //7
                while (answer.length() <= 2) {
                    answer += answer.charAt(answer.length() - 1);
                }

                return answer;
            }
        }
    }
}
