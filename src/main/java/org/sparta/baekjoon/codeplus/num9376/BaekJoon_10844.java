package org.sparta.baekjoon.codeplus.num9376;

import java.io.*;

public class BaekJoon_10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n + 1][11];
        for (int i = 1; i <= 9; i++) {
            arr[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j == 0) {
                    arr[i][j] = arr[i - 1][1];
                } else if (j == 9) {
                    arr[i][j] = arr[i - 1][8];
                } else {
                    arr[i][j] = (arr[i - 1][j - 1] + arr[i - 1][j + 1]) % 1000000000;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            sum = (sum + arr[n][i]) % 1000000000;
        }

        bw.write(sum + "");
        bw.flush();
        bw.close();
    }
}