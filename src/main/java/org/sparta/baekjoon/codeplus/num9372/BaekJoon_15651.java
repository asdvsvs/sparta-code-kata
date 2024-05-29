package org.sparta.baekjoon.codeplus.num9372;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_15651 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        function(n, m, 0, "");

        bw.flush();
        bw.close();
    }

    static void function(int n, int m, int depth, String s) throws IOException {
        if (depth == m) {
            s = s.substring(0, s.length() - 1);
            bw.write(s + "\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            function(n, m, depth + 1, s + i + " ");
        }
    }
}
