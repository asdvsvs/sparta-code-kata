package org.sparta.baekjoon.codeplus.num9370;

import java.io.*;

public class BaekJoon_17427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (long) i * (n / i);
        }

        bw.write(sum + "");
        bw.flush();
        bw.close();
    }
}
