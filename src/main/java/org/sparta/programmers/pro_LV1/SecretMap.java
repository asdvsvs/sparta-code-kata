package org.sparta.programmers.pro_LV1;

public class SecretMap {
    public static void main(String[] args) {
        class Solution {
            public String[] solution(int n, int[] arr1, int[] arr2) {
                String[] answer = new String[n];
                for (int i = 0; i < answer.length; i++) {
                    answer[i] = "";
                }
                String[] sArr1 = new String[n];
                String[] sArr2 = new String[n];

                for (int i = 0; i < arr1.length; i++) {
                    while (arr1[i] > 0) {
                        sArr1[i] = String.valueOf(arr1[i] % 2) + sArr1[i];
                        arr1[i] /= 2;
                    }
                    int len;
                    if (sArr1[i] == null) {
                        len = 0;
                    } else {
                        len = sArr1[i].length();
                    }

                    if (len < n + 4) {
                        for (int a = 0; a < n + 4 - len; a++) {
                            sArr1[i] = "0" + sArr1[i];
                        }
                    }

                }
                for (int i = 0; i < arr2.length; i++) {
                    while (arr2[i] > 0) {
                        sArr2[i] = String.valueOf(arr2[i] % 2) + sArr2[i];
                        arr2[i] /= 2;
                    }

                    int len;
                    if (sArr2[i] == null) {
                        len = 0;
                    } else {
                        len = sArr2[i].length();
                    }

                    if (len < n + 4) {
                        for (int a = 0; a < n + 4 - len; a++) {
                            sArr2[i] = "0" + sArr2[i];
                        }
                    }
                }

                for (int i = 0; i < n; i++) {
                    for (int a = 0; a < n; a++) {
                        if (sArr1[i].charAt(a) == '0' && sArr2[i].charAt(a) == '0') {
                            answer[i] = answer[i] + " ";
                        } else {
                            answer[i] = answer[i] + "#";
                        }
                    }
                }

                return answer;
            }
        }
    }
}
