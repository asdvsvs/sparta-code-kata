package org.sparta.programmers.lv5;

public class QuadNum {

    public static void main(String[] args) {
        class Solution {

            static int[] answer = new int[2];

            public int[] solution(int[][] arr) {

                check(0, 0, arr.length, arr, arr.length);

                return answer;
            }

            public static void check(int x, int y, int size, int[][] arr, int depth) {
                int temp = arr[x][y];
                if (depth == 1) {
                    answer[temp]++;
                    return;
                }
                boolean b = true;
                loop:
                for (int i = x; i < x + size; i++) {
                    for (int j = y; j < y + size; j++) {
                        if (arr[i][j] != temp) {
                            b = false;
                            break loop;
                        }
                    }
                }
                if (b) {
                    answer[temp]++;
                    return;
                }
                check(x, y, size / 2, arr, depth / 2);
                check(x, y + size / 2, size / 2, arr, depth / 2);
                check(x + size / 2, y, size / 2, arr, depth / 2);
                check(x + size / 2, y + size / 2, size / 2, arr, depth / 2);
            }
        }
    }

}
