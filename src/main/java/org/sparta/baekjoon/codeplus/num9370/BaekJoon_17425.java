package org.sparta.baekjoon.codeplus.num9370;
//https://www.acmicpc.net/board/view/107811

import java.io.*;
import java.util.Arrays;

public class BaekJoon_17425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long[] temp = new long[1000000 + 1];
        Arrays.fill(temp, 1);
        long[] sum = new long[1000000 + 1];
        sum[1] = 1;
        for (int i = 2; i <= 1000000; i++) {
            for (int j = 1; i * j <= 1000000; j++) {
                temp[i * j] += i;
            }
            sum[i] = sum[i - 1] + temp[i];
        }
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int num = Integer.parseInt(br.readLine());
            bw.write(sum[num] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
