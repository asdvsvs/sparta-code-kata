package org.sparta.baekjoon.codeplus.num9377;

import java.io.*;

public class BaekJoon_1309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];
        int mod = 9901;
        int temp = 1;
        dp[0] = 1;
        dp[1] = 3;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1] * 2) % mod;
        }

        bw.write(dp[n] + "");
        bw.flush();
        bw.close();
    }
}