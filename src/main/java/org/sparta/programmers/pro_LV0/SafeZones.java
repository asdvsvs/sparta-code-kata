package org.sparta.programmers.pro_LV0;

public class SafeZones {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[][] board) {
                int answer = board.length * board[0].length;

                int[][] temp = new int[board.length][board[0].length];

                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board[i].length; j++) {
                        if (board[i][j] == 1) {
                            temp[i][j] = 1;
                            if (j != 0) {
                                temp[i][j - 1] = 1;

                                if (i != 0) temp[i - 1][j - 1] = 1;
                                if (i != board.length - 1) temp[i + 1][j - 1] = 1;
                            }
                            if (j != board[i].length - 1) {
                                temp[i][j + 1] = 1;

                                if (i != 0) temp[i - 1][j + 1] = 1;
                                if (i != board.length - 1) temp[i + 1][j + 1] = 1;
                            }
                            if (i != 0) {
                                temp[i - 1][j] = 1;
                            }
                            if (i != board.length - 1) {
                                temp[i + 1][j] = 1;
                            }
                        }
                    }
                }

                for (int[] arr : temp) {
                    for (int i : arr) {
                        if (i == 1) {
                            answer--;
                        }
                    }
                }

                return answer;
            }
        }
    }
}
