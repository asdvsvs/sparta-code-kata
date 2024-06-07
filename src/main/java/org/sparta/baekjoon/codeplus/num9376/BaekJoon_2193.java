package org.sparta.baekjoon.codeplus.num9376;

import java.io.*;

public class BaekJoon_2193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long[][] dp = new long[n + 1][2];
        dp[1][0] = 0;
        dp[1][1] = 1;
        if (n > 1) {
            dp[2][0] = 1;
            dp[2][1] = 0;
        }
        for (int i = 3; i <= n; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 1][1];
            dp[i][1] = dp[i - 1][0];
        }

        bw.write(dp[n][0] + dp[n][1] + "");
        bw.flush();
        bw.close();
    }
}
