package org.sparta.programmers.lv5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class NumberConvert {

    public static void main(String[] args) {
        class Solution {

            public int solution(int x, int y, int n) {
                int answer = 0;

                int[] dp = new int[y + 1];
                Queue<Integer> q = new LinkedList<>();
                Arrays.fill(dp, -1);
                dp[x] = 0;
                q.add(x);
                while (true) {
                    if (q.isEmpty()) {
                        break;
                    }
                    int i = q.poll();
                    if (dp[i] != -1) {
                        if (i + n <= y && dp[i + n] == -1) {
                            dp[i + n] = dp[i] + 1;
                            if (i + n <= y) {
                                q.add(i + n);
                            }
                        }
                        if (i * 2 <= y && dp[i * 2] == -1) {
                            dp[i * 2] = dp[i] + 1;
                            if (i * 2 <= y) {
                                q.add(i * 2);
                            }
                        }
                        if (i * 3 <= y && dp[i * 3] == -1) {
                            dp[i * 3] = dp[i] + 1;
                            if (i * 3 <= y) {
                                q.add(i * 3);
                            }
                        }
                    }
                    if (dp[y] != -1) {
                        break;
                    }
                }
                answer = dp[y];
                return answer;
            }
        }
    }

}
