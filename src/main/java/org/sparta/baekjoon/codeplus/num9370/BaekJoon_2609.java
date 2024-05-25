package org.sparta.baekjoon.codeplus.num9370;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int max = 0;
        for (int i = Math.min(a, b); i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                max = i;
                break;
            }
        }
        int min = a * b / max;
        bw.write(max + "\n");
        bw.write(min + "");
        bw.flush();
        bw.close();
    }
}
