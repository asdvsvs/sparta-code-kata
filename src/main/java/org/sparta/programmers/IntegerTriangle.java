package org.sparta.programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/43105
public class IntegerTriangle {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[][] triangle) {
                int answer = 0;

                for (int i = 1; i < triangle.length; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        if (j == 0) {
                            triangle[i][j] += triangle[i - 1][j];
                        } else if (j == i) {
                            triangle[i][j] += triangle[i - 1][j - 1];
                        } else {
                            triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);
                        }
                    }
                }

                for (int i = 0; i < triangle[triangle.length - 1].length; i++) {
                    answer = Math.max(answer, triangle[triangle.length - 1][i]);
                }


                return answer;
            }
        }
    }
}
