package org.sparta.programmers.lv4;

public class TruncateN2Array {

    public static void main(String[] args) {
        class Solution {

            public int[] solution(int n, long left, long right) {
                int[] answer = new int[(int) (right - left + 1)];

                int row = (int) (left / n);
                int col = (int) (left % n);
                for (int i = 0; i < answer.length; i++) {
                    answer[i] = Math.max(row, col) + 1;
                    col++;
                    if (col == n) {
                        row++;
                        col = 0;
                    }

                }

                return answer;
            }
        }
    }

}
