package org.sparta.baekjoon.bylevel.lv23;

import java.io.*;

public class BaekJoon_2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] moveOne = new int[n];
        int[] moveTwo = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        if (n >= 1) {
            moveOne[0] = arr[0];
        }
        if (n >= 2) {
            moveOne[1] = arr[0] + arr[1];
            moveTwo[1] = arr[1];
        }
        for (int i = 2; i < n; i++) {
            moveOne[i] = moveTwo[i - 1] + arr[i];
            moveTwo[i] = Math.max(moveOne[i - 2], moveTwo[i - 2]) + arr[i];
        }

        bw.write(Math.max(moveOne[n - 1], moveTwo[n - 1]) + "");
        bw.flush();
        bw.close();
    }
}
