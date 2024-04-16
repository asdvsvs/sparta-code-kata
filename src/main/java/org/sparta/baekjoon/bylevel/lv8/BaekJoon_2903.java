package org.sparta.baekjoon.bylevel.lv8;

import java.io.*;

public class BaekJoon_2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int start = 2;
        for (int i = 0; i < n; i++) {
            start = start * 2 - 1;
        }
        bw.write(start * start + "");
        bw.flush();
        bw.close();
    }
}
