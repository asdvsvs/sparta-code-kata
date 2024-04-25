package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/learn/courses/30/lessons/17681
public class Pro_17681 {
    public static void main(String[] args) {
        class Solution {
            public String[] solution(int n, int[] arr1, int[] arr2) {
                String[] answer = new String[arr1.length];

                for (int i = 0; i < arr1.length; i++) {
                    String s1 = Integer.toBinaryString(arr1[i]);
                    String s2 = Integer.toBinaryString(arr2[i]);
                    answer[i] = "";

                    if (s1.length() < arr1.length) {
                        int temp = arr1.length - s1.length();
                        for (int j = 0; j < temp; j++) {
                            s1 = "0" + s1;
                        }
                    }
                    if (s2.length() < arr1.length) {
                        int temp = arr1.length - s2.length();
                        for (int j = 0; j < temp; j++) {
                            s2 = "0" + s2;
                        }
                    }

                    for (int j = 0; j < arr1.length; j++) {
                        if (s1.charAt(j) == '1' || s2.charAt(j) == '1') {
                            answer[i] += '#';
                        } else {
                            answer[i] += ' ';
                        }
                    }

                }

                return answer;
            }
        }
    }
}
