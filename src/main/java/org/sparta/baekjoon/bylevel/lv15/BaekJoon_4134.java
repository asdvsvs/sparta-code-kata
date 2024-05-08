package org.sparta.baekjoon.bylevel.lv15;

import java.io.*;

public class BaekJoon_4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine());
        for (int i = 0; i < N; i++) {
            long n = Long.parseLong(br.readLine());
            while (true) {
                boolean bool = true;
                if (n == 0 || n == 1 || n == 2) {
                    bw.write(2 + "\n");
                    break;
                }
                for (int j = 2; j <= Math.sqrt(n) + 1; j++) {
                    if (n % j == 0) {
                        n++;
                        bool = false;
                        break;
                    }
                }
                if (bool) {
                    bw.write(n + "\n");
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
