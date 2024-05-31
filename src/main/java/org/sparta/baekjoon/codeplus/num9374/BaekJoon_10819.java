package org.sparta.baekjoon.codeplus.num9374;

import java.io.*;

public class BaekJoon_10819 {
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }

        dfs(n, 0, arr, new int[n], new boolean[n]);

        bw.write(max + "");
        bw.flush();
        bw.close();
    }

    static void dfs(int n, int depth, int[] arr, int[] temp, boolean[] visited) {
        if (depth == n) {
            int sum = 0;
            for (int i = 0; i < n - 1; i++) {
                sum += Math.abs(temp[i] - temp[i + 1]);
            }
            max = Math.max(max, sum);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp[depth] = arr[i];
                dfs(n, depth + 1, arr, temp, visited);
                visited[i] = false;
            }
        }
    }
}
