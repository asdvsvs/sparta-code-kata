package org.sparta.baekjoon.bylevel.lv15;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int n = 0;
            for (int j = Math.min(a, b); j >= 1; j--) {
                if (a % j == 0 && b % j == 0) {
                    n = j;
                    break;
                }
            }

            bw.write(a / n * b + "\n");
        }
        bw.flush();
        bw.close();
    }
}
