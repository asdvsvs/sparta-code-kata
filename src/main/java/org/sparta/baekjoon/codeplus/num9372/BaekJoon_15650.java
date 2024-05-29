package org.sparta.baekjoon.codeplus.num9372;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_15650 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        function(n, m, 1, 0, "");

        bw.flush();
        bw.close();
    }

    static void function(int n, int m, int idx, int depth, String s) throws IOException {
        if (depth == m) {
            for (int i = 0; i < s.length(); i++) {
                bw.write(s.charAt(i) + "");
                if (i != s.length() - 1) {
                    bw.write(" ");
                }
            }
            bw.newLine();
            return;
        }

        for (int i = idx; i <= n; i++) {
            function(n, m, i + 1, depth + 1, s + i);
        }
    }
}
