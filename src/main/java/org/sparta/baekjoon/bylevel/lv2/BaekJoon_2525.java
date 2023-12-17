package org.sparta.baekjoon.bylevel.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_2525 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());

        if (b + c >= 60) {
            a = a + (b + c) / 60;
            if (a >= 24) {
                a = a % 24;
            }
            b = (b + c) % 60;
        } else {
            b = b + c;
        }

        bw.write(a + " " + b);
        bw.flush();
        bw.close();
    }
}
