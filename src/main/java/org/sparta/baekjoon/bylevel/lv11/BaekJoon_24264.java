package org.sparta.baekjoon.bylevel.lv11;

import java.io.*;

public class BaekJoon_24264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Integer.parseInt(br.readLine());
        long cnt = n * n;
        bw.write(cnt + "\n");
        bw.write(2 + "");
        bw.flush();
        bw.close();
    }
}
