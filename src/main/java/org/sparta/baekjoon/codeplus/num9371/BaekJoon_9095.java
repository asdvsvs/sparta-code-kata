package org.sparta.baekjoon.codeplus.num9371;

import java.io.*;

public class BaekJoon_9095 {
    static int[] arr = new int[12];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int n = 1; n <= 11; n++) {
            dfs(n, 0);
        }

        for (int i = 0; i < t; i++) {
            bw.write(arr[Integer.parseInt(br.readLine())] + "\n");
        }
        bw.flush();
        bw.close();
    }

    static void dfs(int n, int sum) {
        if (sum >= n) {
            if (sum == n) {
                arr[n]++;
            }
            return;
        }

        for (int i = 1; i <= 3; i++) {
            dfs(n, sum + i);
        }
    }
}
