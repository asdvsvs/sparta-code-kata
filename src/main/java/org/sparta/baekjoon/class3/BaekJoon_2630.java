package org.sparta.baekjoon.class3;

import java.io.*;

public class BaekJoon_2630 {
    static int white = 0;
    static int blue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] strArr = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(strArr[j]);
            }
        }

        func(arr, 0, 0, n);
        bw.write(white + "\n");
        bw.write(blue + "");
        bw.flush();
        bw.close();
    }

    static void func(int[][] arr, int x, int y, int length) {
        if (arr[x][y] == 0) {
            for (int i = x; i < x + length; i++) {
                for (int j = y; j < y + length; j++) {
                    if (arr[i][j] == 1) {
                        int half = length / 2;
                        func(arr, x, y, half);
                        func(arr, x + half, y, half);
                        func(arr, x, y + half, half);
                        func(arr, x + half, y + half, half);
                        return;
                    }
                }
            }
            white++;
        } else {
            for (int i = x; i < x + length; i++) {
                for (int j = y; j < y + length; j++) {
                    if (arr[i][j] == 0) {
                        int half = length / 2;
                        func(arr, x, y, half);
                        func(arr, x + half, y, half);
                        func(arr, x, y + half, half);
                        func(arr, x + half, y + half, half);
                        return;
                    }
                }
            }
            blue++;
        }
    }
}
