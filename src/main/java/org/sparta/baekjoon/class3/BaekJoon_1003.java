package org.sparta.baekjoon.class3;

import java.io.*;

public class BaekJoon_1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[41][2];
        arr[0][0] = 1;
        arr[1][1] = 1;
        for (int i = 2; i <= 40; i++) {
            arr[i][0] = arr[i - 1][0] + arr[i - 2][0];
            arr[i][1] = arr[i - 1][1] + arr[i - 2][1];
        }

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            bw.write(arr[n][0] + " " + arr[n][1]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
