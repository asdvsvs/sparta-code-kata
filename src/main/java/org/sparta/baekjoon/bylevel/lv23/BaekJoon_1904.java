package org.sparta.baekjoon.bylevel.lv23;

import java.io.*;

public class BaekJoon_1904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                arr[i] = 1;
            } else if (i == 1) {
                arr[i] = 2;
            } else {
                arr[i] = (arr[i - 1] + arr[i - 2]) % 15746;
            }
        }

        bw.write(arr[n - 1] + "");
        bw.flush();
        bw.close();
    }
}