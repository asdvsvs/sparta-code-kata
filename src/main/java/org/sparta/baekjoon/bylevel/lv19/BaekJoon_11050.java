package org.sparta.baekjoon.bylevel.lv19;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int a = 1;
        int b = 1;
        int c = 1;

        for (int i = n; i > 1; i--) {
            a *= i;
        }
        for (int i = k; i > 1; i--) {
            b *= i;
        }
        for (int i = n - k; i > 1; i--) {
            c *= i;
        }

        bw.write(a / b / c + "");
        bw.flush();
        bw.close();
    }
}
