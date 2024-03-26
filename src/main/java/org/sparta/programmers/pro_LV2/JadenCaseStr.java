package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12951#
public class JadenCaseStr {
    public static void main(String[] args) {
        class Solution {
            public String solution(String s) {
                String answer = "";
                s += "#";
                s = s.toLowerCase();
                String[] arr = s.split(" ");

                for (String str : arr) {
                    if (str.equals("")) {
                        answer += " ";
                        continue;
                    }
                    char[] ch = str.toCharArray();
                    if (ch[0] >= 'a' && ch[0] <= 'z') {
                        ch[0] -= 32;
                    }
                    for (char c : ch) {
                        answer += c;
                    }
                    if (!str.equals(arr[arr.length - 1])) {
                        answer += " ";
                    }
                }
                answer = answer.replace("#", "");

                return answer;
            }
        }
    }
}
