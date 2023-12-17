package org.sparta.baekjoon.bylevel.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_9498 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        if (100 >= n && n >= 90) {
            bw.write("A");
        } else if (n >= 80) {
            bw.write("B");
        } else if (n >= 70) {
            bw.write("C");
        } else if (n >= 60) {
            bw.write("D");
        } else {
            bw.write("F");
        }
        bw.flush();
        bw.close();
    }

}
