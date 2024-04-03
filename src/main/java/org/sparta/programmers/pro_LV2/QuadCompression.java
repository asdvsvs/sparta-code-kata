package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/68936
public class QuadCompression {
    public static void main(String[] args) {
        class Solution {
            static int[] answer = new int[2];

            public int[] solution(int[][] arr) {

                f(arr, arr.length, 0, 0);

                return answer;
            }

            void f(int[][] arr, int length, int x, int y) {
                boolean bool = true;

                loop:
                for (int i = x; i < length + x; i++) {
                    for (int j = y; j < length + y; j++) {
                        if (arr[x][y] != arr[i][j]) {
                            bool = false;
                            break loop;
                        }
                    }
                }

                if (!bool) {
                    f(arr, length / 2, x, y);
                    f(arr, length / 2, x, y + length / 2);
                    f(arr, length / 2, x + length / 2, y);
                    f(arr, length / 2, x + length / 2, y + length / 2);
                } else {
                    answer[arr[x][y]]++;
                    return;
                }

            }
        }
    }
}
