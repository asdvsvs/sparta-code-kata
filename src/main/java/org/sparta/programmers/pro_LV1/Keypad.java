package org.sparta.programmers.pro_LV1;

public class Keypad {
    public static void main(String[] args) {
        class Solution {
            public String solution(int[] numbers, String hand) {
                String answer = "";
                String leftNum = "147";
                String rightNum = "369";
                int left = 10;
                int right = 12;

                for (int n : numbers) {
                    int i;
                    if (n == 0) {
                        i = 11;
                    } else {
                        i = n;
                    }
                    if (leftNum.contains(String.valueOf(i))) {
                        answer = answer + "L";
                        left = i;
                    } else if (rightNum.contains(String.valueOf(i))) {
                        answer = answer + "R";
                        right = i;
                    } else {
                        int y = i / 3 + 1;
                        int lLoc = left / 3;
                        int rLoc = right / 3;
                        if (left % 3 != 0) {
                            lLoc = left / 3 + 1;
                        }
                        if (right % 3 != 0) {
                            rLoc = right / 3 + 1;
                        }

                        if ((left - 2) % 3 == 0) {
                            lLoc = Math.abs(y - lLoc) - 1;
                        } else {
                            lLoc = Math.abs(y - lLoc);
                        }
                        if ((right - 2) % 3 == 0) {
                            rLoc = Math.abs(y - rLoc) - 1;
                        } else {
                            rLoc = Math.abs(y - rLoc);
                        }

                        if (lLoc == rLoc) {
                            answer = answer + hand.toUpperCase().substring(0, 1);
                            if (hand.toUpperCase().substring(0, 1).equals("L")) {
                                left = i;
                            } else {
                                right = i;
                            }
                        } else if (lLoc < rLoc) {
                            answer = answer + "L";
                            left = i;
                        } else {
                            answer = answer + "R";
                            right = i;
                        }

                    }
                }

                return answer;
            }
        }
    }
}
