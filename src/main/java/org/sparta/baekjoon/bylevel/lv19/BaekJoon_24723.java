package org.sparta.baekjoon.bylevel.lv19;

import java.io.*;

public class BaekJoon_24723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 1;

        for (int i = 0; i < n; i++) {
            cnt *= 2;
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}
