package org.sparta.programmers.lv5;

public class Fatigue {

    public static void main(String[] args) {
        class Solution {

            static int max = 0;

            public int solution(int k, int[][] dungeons) {
                int answer = -1;
                function(k, 0, dungeons, new boolean[dungeons.length]);
                answer = max;
                return answer;
            }

            public void function(int my, int depth, int[][] dungeons, boolean[] visited) {
                max = Math.max(max, depth);
                for (int i = 0; i < dungeons.length; i++) {
                    if (!visited[i]) {
                        if (my >= dungeons[i][0]) {
                            visited[i] = true;
                            function(my - dungeons[i][1], depth + 1, dungeons, visited);
                            visited[i] = false;
                        }
                    }
                }
            }
        }
    }

}
