package org.sparta.baekjoon.bylevel.lv15;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st1.nextToken());
        int b = Integer.parseInt(st1.nextToken());
        int c = Integer.parseInt(st2.nextToken());
        int d = Integer.parseInt(st2.nextToken());

        int A = a * d + c * b;
        int B = b * d;
        for (int i = Math.min(A, B); i > 1; i--) {
            if (A % i == 0 && B % i == 0) {
                A /= i;
                B /= i;
            }
        }
        bw.write(A + " " + B);
        bw.flush();
        bw.close();
    }
}
