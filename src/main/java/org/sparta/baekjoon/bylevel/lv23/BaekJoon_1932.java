package org.sparta.baekjoon.bylevel.lv23;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    arr[i][j] += arr[i - 1][j];
                } else if (j == i) {
                    arr[i][j] += arr[i - 1][i - 1];
                } else {
                    arr[i][j] += Math.max(arr[i - 1][j - 1], arr[i - 1][j]);
                }
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[n - 1][i]);
        }
        bw.write(max + "");
        bw.flush();
        bw.close();
    }
}
