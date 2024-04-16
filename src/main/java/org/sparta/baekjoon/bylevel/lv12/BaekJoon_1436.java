package org.sparta.baekjoon.bylevel.lv12;

import java.io.*;

public class BaekJoon_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int six = 666;
        int cnt = 0;

        while (true) {
            if (String.valueOf(six).contains("666")) {
                cnt++;
            }
            if (cnt == n) {
                break;
            }
            six++;
        }
        bw.write(six + "");
        bw.flush();
        bw.close();
    }
}
