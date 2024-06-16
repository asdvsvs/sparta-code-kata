package org.sparta.baekjoon.bylevel.lv3;

import java.io.*;

public class BaekJoon_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String s = "int";
        for (int i = 0; i < n / 4; i++) {
            s = "long " + s;
        }

        bw.write(s);
        bw.flush();
        bw.close();
    }
}
