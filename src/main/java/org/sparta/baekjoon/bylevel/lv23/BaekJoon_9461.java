package org.sparta.baekjoon.bylevel.lv23;

import java.io.*;

//자료형 주의
public class BaekJoon_9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            long[] arr = new long[n];
            for (int j = 0; j < n; j++) {
                if (j <= 2) {
                    arr[j] = 1;
                } else {
                    arr[j] = arr[j - 2] + arr[j - 3];
                }
            }
            bw.write(arr[n - 1] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
