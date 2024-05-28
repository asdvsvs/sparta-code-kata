package org.sparta.baekjoon.codeplus.num9372;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_15649 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        function(n, m, new int[m], 0, new boolean[n]);

        bw.flush();
        bw.close();
    }

    static void function(int n, int m, int[] arr, int depth, boolean[] visited) throws IOException {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                bw.write(arr[i] + "");
                if (i != m - 1) {
                    bw.write(" ");
                }
            }
            bw.newLine();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i + 1;
                function(n, m, arr, depth + 1, visited);
                visited[i] = false;
            }
        }
    }
}
