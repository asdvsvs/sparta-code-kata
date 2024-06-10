package org.sparta.baekjoon.codeplus.num9377;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_11055 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n + 1];
        dp[1] = arr[1];

        for (int i = 2; i <= n; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max + arr[i];
        }

        int max = 0;
        for (int i : dp) {
            max = Math.max(max, i);
        }

        bw.write(max + "");
        bw.flush();
        bw.close();
    }
}
