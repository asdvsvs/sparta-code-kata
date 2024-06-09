package org.sparta.baekjoon.codeplus.num9377;
//https://raejoonee.tistory.com/15

import java.io.*;

public class BaekJoon_2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] move1 = new int[n + 1];
        int[] move2 = new int[n + 1];

        move1[1] = 0;
        move2[1] = arr[1];
        int max = Math.max(move1[1], move2[1]);

        if (n > 1) {
            move1[2] = move2[1] + arr[2];
            move2[2] = arr[2];
            max = Math.max(move1[2], move2[2]);
        }

        int maxN = 0;
        for (int i = 3; i <= n; i++) {
            move1[i] = move2[i - 1] + arr[i];
            move2[i] = Math.max(move2[i - 2], maxN) + arr[i];
            maxN = Math.max(maxN, Math.max(move1[i - 1], move2[i - 1]));
            int m = Math.max(move1[i], move2[i]);
            max = Math.max(max, m);
        }

        bw.write(max + "");
        bw.flush();
        bw.close();
    }
}