package org.sparta.baekjoon.codeplus.num9373;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_14501 {
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] t = new int[n];
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }
        dfs(t, p, n, 0, 0, 0);
        bw.write(max + "");
        bw.flush();
        bw.close();
    }

    static void dfs(int[] t, int[] p, int n, int day, int sum, int idx) {
        if (day == n) {
            max = Math.max(max, sum);
            return;
        }

        for (int i = idx; i < n; i++) {
            if (i >= day) {
                if (i + t[i] <= n) {
                    dfs(t, p, n, i + t[i], sum + p[i], i + t[i]);
                } else {
                    dfs(t, p, n, n, sum, i);
                }
            }
        }
    }
}
