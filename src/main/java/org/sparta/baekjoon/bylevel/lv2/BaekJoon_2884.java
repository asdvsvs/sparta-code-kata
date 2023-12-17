package org.sparta.baekjoon.bylevel.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_2884 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        int totalMin = 60 * hour + min;
        int result = totalMin - 45;
        if (result < 0) {
            result = 60 * 24 + result;
        }

        bw.write(result / 60 + " " + result % 60);
        bw.flush();
        bw.close();
    }
}
