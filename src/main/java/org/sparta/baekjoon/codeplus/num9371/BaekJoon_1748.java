package org.sparta.baekjoon.codeplus.num9371;

import java.io.*;

public class BaekJoon_1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int n = Integer.parseInt(s);
        int cnt = 0;
        int temp = 9;

        for (int i = 1; i <= s.length(); i++) {
            if (i >= 3) {
                temp *= 10;
            }
            if (i >= 2) {
                cnt += temp * (i - 1);
                n = n - temp;
            }

            if (i == s.length()) {
                cnt += n * i;
            }
        }

        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}
