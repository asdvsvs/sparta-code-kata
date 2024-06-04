package org.sparta.baekjoon.codeplus.num9376;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_16194 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                arr[i] = Math.min(arr[i], arr[i - j] + arr[j]);
            }
        }

        bw.write(arr[n] + "");
        bw.flush();
        bw.close();
    }
}
