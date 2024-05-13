package org.sparta.programmers.pro_LV3;

//https://school.programmers.co.kr/learn/courses/30/lessons/42898
public class Pro_42898 {
    public static void main(String[] args) {
        // https://school.programmers.co.kr/questions/33014 정확도 10번 실패
        // https://school.programmers.co.kr/questions/46669 효율성 실패
        class Solution {
            public int solution(int m, int n, int[][] puddles) {
                int answer = 0;
                int[][] way = new int[m][n];

                for (int[] arr : puddles) {
                    way[arr[0] - 1][arr[1] - 1] = -1;
                }

                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i == 0 && j == 0) {
                            continue;
                        }
                        if (way[i][j] != -1) {
                            if (i == 0) {
                                if (way[i][j - 1] != -1) {
                                    way[i][j] = 1;
                                } else {
                                    way[i][j] = -1;
                                }
                            } else if (j == 0) {
                                if (way[i - 1][j] != -1) {
                                    way[i][j] = 1;
                                } else {
                                    way[i][j] = -1;
                                }
                            } else {
                                if (way[i][j - 1] == -1 && way[i - 1][j] == -1) {
                                    way[i][j] = -1;
                                } else if (way[i][j - 1] == -1) {
                                    way[i][j] = way[i - 1][j];
                                } else if (way[i - 1][j] == -1) {
                                    way[i][j] = way[i][j - 1];
                                } else {
                                    way[i][j] = (way[i][j - 1] + way[i - 1][j]) % 1000000007;
                                }
                            }
                        }
                    }
                }
                if (way[m - 1][n - 1] == -1) {
                    answer = 0;
                } else {
                    answer = way[m - 1][n - 1];
                }

                return answer;
            }
        }
    }
}
