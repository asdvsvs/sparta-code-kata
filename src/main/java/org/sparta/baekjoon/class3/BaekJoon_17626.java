package org.sparta.baekjoon.class3;

import java.io.*;

public class BaekJoon_17626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            int a = (int) Math.sqrt(i);
            int min = 4;
            if (i == a * a) {
                dp[i] = 1;
            } else {
                while (a >= 1) {
                    int temp = dp[a * a] + dp[i - a * a];
                    if (temp <= 4) {
                        min = Math.min(min, temp);
                    }
                    a--;
                }
                dp[i] = min;
            }
        }
        bw.write(dp[n] + "");

        bw.flush();
        bw.close();
    }
}
