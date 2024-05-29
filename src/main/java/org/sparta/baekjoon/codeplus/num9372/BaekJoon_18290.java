package org.sparta.baekjoon.codeplus.num9372;
//https://www.acmicpc.net/board/view/137294https://www.acmicpc.net/board/view/137294

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_18290 {
    static int max = -40000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n * m + 1];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; j++) {
                arr[(i - 1) * m + j] = Integer.parseInt(st1.nextToken());
            }
        }
        function(n, m, 1, k, 0, arr, new boolean[n * m + 1], 0);

        bw.write(max + "");
        bw.flush();
        bw.close();
    }

    static void function(int n, int m, int idx, int k, int depth, int[] arr, boolean[] visited, int sum) {
        if (depth == k) {
            max = Math.max(max, sum);
            return;
        }

        for (int i = idx; i <= n * m; i++) {
            if (!visited[i]) {
                visited[i] = true;
                boolean a = false;
                boolean b = false;
                if (i % m != 0) {
                    if (i + 1 <= n * m) {
                        if (visited[i + 1]) {
                            a = true;
                        }
                        visited[i + 1] = true;
                    }
                }
                if ((i - 1) / m < n - 1) {
                    if (i + m <= n * m) {
                        if (visited[i + m]) {
                            b = true;
                        }
                        visited[i + m] = true;
                    }
                }
                function(n, m, i, k, depth + 1, arr, visited, sum + arr[i]);
                visited[i] = false;
                if (i % m != 0 && !a) {
                    if (i + 1 <= n * m) {
                        visited[i + 1] = false;
                    }
                }
                if ((i - 1) / m < n - 1 && !b) {
                    if (i + m <= n * m) {
                        visited[i + m] = false;
                    }
                }
            }
        }
    }
}
