package org.sparta.baekjoon.bylevel.lv19;

import java.io.*;

public class BaekJoon_15439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    cnt++;
                }
            }
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}
