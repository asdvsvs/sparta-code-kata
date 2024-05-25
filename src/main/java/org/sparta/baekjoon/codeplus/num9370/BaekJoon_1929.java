package org.sparta.baekjoon.codeplus.num9370;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for (int i = m; i <= n; i++) {
            int cnt = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    cnt++;
                    break;
                }
            }
            if (i != 1 && cnt == 0) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
