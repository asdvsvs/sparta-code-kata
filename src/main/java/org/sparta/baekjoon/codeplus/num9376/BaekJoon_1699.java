package org.sparta.baekjoon.codeplus.num9376;

import java.io.*;

public class BaekJoon_1699 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int min = 100000;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i - j * j == 0) {
                    min = 1;
                } else {
                    min = Math.min(min, arr[j * j] + arr[i - j * j]);
                }
            }
            arr[i] = min;
        }

        bw.write(arr[n] + "");
        bw.flush();
        bw.close();
    }
}
