package org.sparta.baekjoon.codeplus.num9371;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_6064 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int k = 0; k < t; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int answer = 0;
            for (int i = x; i <= m * n; i += m) {
                int temp = 0;
                if (i % n == 0) {
                    temp = n;
                } else {
                    temp = i % n;
                }

                if (temp == y) {
                    answer = i;
                    break;
                }
            }
            if (answer != 0) {
                bw.write(answer + "\n");
            } else {
                bw.write("-1\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
