package org.sparta.baekjoon.bylevel.lv15;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long n = 0;
        for (int i = (int) Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                n = i;
                break;
            }
        }
        bw.write(a / n * b + "");
        bw.flush();
        bw.close();
    }
}
