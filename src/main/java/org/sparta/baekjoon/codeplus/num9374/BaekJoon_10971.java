package org.sparta.baekjoon.codeplus.num9374;

import java.io.*;

public class BaekJoon_10971 {
    static int min = 10000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < s.length; j++) {
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }
        function(n, 1, arr, new boolean[n], 0, 0);

        bw.write(min + "");
        bw.flush();
        bw.close();
    }

    static void function(int n, int depth, int[][] arr, boolean[] visited, int before, int sum) {
        if (depth == n) {
            if (arr[before][0] != 0) {
                sum += arr[before][0];
                min = Math.min(min, sum);
            }
            return;
        }

        for (int i = 1; i < n; i++) {
            if (!visited[i]) {
                if (arr[before][i] != 0) {
                    visited[i] = true;
                    function(n, depth + 1, arr, visited, i, sum + arr[before][i]);
                    visited[i] = false;
                }
            }
        }
    }
}
