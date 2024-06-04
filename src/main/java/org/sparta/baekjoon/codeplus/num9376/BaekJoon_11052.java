package org.sparta.baekjoon.codeplus.num9376;
//https://www.acmicpc.net/board/view/104501

import java.io.*;

public class BaekJoon_11052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i + 1] = Integer.parseInt(input[i]);
        }
        int[] max = new int[n + 1];
        max[1] = arr[1];
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                max[i] = Math.max(max[i], Math.max(arr[i], max[i - j] + max[j]));
            }
        }


        bw.write(max[n] + "");
        bw.flush();
        bw.close();
    }
}
