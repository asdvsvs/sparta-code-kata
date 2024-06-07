package org.sparta.baekjoon.codeplus.num9376;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_2225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] arr = new int[k + 1][n + 1];
        Arrays.fill(arr[1], 1);

        for (int i = 2; i <= k; i++) {
            for (int j = 0; j <= n; j++) {
                for (int t = 0; t <= j; t++) {
                    arr[i][j] = (arr[i][j] + arr[i - 1][t]) % 1000000000;
                }
            }
        }

        bw.write(arr[k][n] + "");
        bw.flush();
        bw.close();
    }
}