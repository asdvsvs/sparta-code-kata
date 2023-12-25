package org.sparta.baekjoon.bylevel.lv23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Fibonaci_24416 {

    static int recurCount = 0;
    static int dpCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        fibo(n);
        dp(n);

        bw.write(recurCount + " ");
        bw.write(dpCount + "");
        bw.flush();
        bw.close();
    }

    public static int fibo(int n) {
        if (n == 1 || n == 2) {
            recurCount++;
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static int dp(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n; i++) {
            dpCount++;
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1];
    }
}
