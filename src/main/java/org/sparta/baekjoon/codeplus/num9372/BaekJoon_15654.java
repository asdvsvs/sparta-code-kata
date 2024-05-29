package org.sparta.baekjoon.codeplus.num9372;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_15654 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        Arrays.sort(arr);
        function(n, m, arr, new boolean[n], 0, "");

        bw.flush();
        bw.close();
    }

    static void function(int n, int m, int[] arr, boolean[] visited, int depth, String s) throws IOException {
        if (depth == m) {
            s = s.substring(0, s.length() - 1);
            bw.write(s + "\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                function(n, m, arr, visited, depth + 1, s + arr[i] + " ");
                visited[i] = false;
            }
        }
    }
}
