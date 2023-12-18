package org.sparta.programmers.lv4;

public class RepeatConverse {

    public static void main(String[] args) {
        class Solution {

            public int[] solution(String s) {
                int[] answer = new int[2];
                int count = 0;
                int zeroCount = 0;
                while (s.length() > 1) {
                    int temp = s.length();
                    s = s.replace("0", "");
                    zeroCount += temp - s.length();

                    s = converse(s.length());
                    count++;
                }
                answer[0] = count;
                answer[1] = zeroCount;
                return answer;
            }

            public static String converse(int num) {
                String s = "";
                while (true) {
                    s = s + num % 2;
                    if (num == 1) {
                        break;
                    }
                    num = num / 2;
                }
                return s;
            }
        }
    }

}
