package org.sparta.baekjoon.codeplus.num9374;

import java.io.*;

public class BaekJoon_10974 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        dfs(n, 0, new boolean[n + 1], "");

        bw.flush();
        bw.close();
    }

    static void dfs(int n, int depth, boolean[] visited, String s) throws IOException {
        if (depth == n) {
            bw.write(s.substring(0, s.length() - 1));
            bw.newLine();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(n, depth + 1, visited, s + i + " ");
                visited[i] = false;
            }
        }
    }
}
