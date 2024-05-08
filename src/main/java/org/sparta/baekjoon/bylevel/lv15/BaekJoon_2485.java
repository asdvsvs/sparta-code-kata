package org.sparta.baekjoon.bylevel.lv15;

import java.io.*;

public class BaekJoon_2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int size = arr[arr.length - 1] - arr[0];
        int a = size / n + 1;
        for (int i = 1; i < n; i++) {
            if ((arr[i] - arr[0]) % a != 0) {
                a--;
                i = 0;
            }
        }

        int answer = size / a - n + 1;
        bw.write(answer + "");
        bw.flush();
        bw.close();

    }
}
