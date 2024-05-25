package org.sparta.baekjoon.codeplus.num9370;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num != 1) {
                int cnt = 0;
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        cnt++;
                    }
                }
                if (cnt == 0) {
                    count++;
                }
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}
