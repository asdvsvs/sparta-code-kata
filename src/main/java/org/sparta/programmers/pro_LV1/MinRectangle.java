package org.sparta.programmers.pro_LV1;

public class MinRectangle {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[][] sizes) {
                int answer = 0;
                int w = 0;
                int h = 0;
                for (int i = 0; i < sizes.length; i++) {
                    if (sizes[i][0] < sizes[i][1]) {
                        int temp = sizes[i][0];
                        sizes[i][0] = sizes[i][1];
                        sizes[i][1] = temp;
                    }
                    w = Math.max(sizes[i][0], w);
                    h = Math.max(sizes[i][1], h);
                }

                answer = w * h;
                return answer;
            }
        }
    }
}
