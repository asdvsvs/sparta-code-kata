package org.sparta.programmers.pro_LV3;

//https://school.programmers.co.kr/learn/courses/30/lessons/43105
public class Pro_43105 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[][] triangle) {
                int answer = 0;

                for (int i = 1; i < triangle.length; i++) {
                    for (int j = 0; j < triangle[i].length; j++) {
                        if (j == 0) {
                            triangle[i][j] += triangle[i - 1][j];
                        } else if (j == triangle[i].length - 1) {
                            triangle[i][j] += triangle[i - 1][j - 1];
                        } else {
                            triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);
                        }
                    }
                }

                for (int i : triangle[triangle.length - 1]) {
                    answer = Math.max(i, answer);
                }

                return answer;
            }
        }
    }
}
