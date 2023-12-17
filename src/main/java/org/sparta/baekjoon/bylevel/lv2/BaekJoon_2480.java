package org.sparta.baekjoon.bylevel.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_2480 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int result = 0;

        if (a == b && a == c) {
            result = 10000 + a * 1000;
        } else if (a != b && a != c && b != c) {
            int max = Math.max(a, b);
            max = Math.max(max, c);
            result = max * 100;
        } else {
            if (a == b) {
                result = 1000 + a * 100;
            } else if (a == c) {
                result = 1000 + a * 100;
            } else {
                result = 1000 + b * 100;
            }
        }
        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}
