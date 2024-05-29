package org.sparta.baekjoon.codeplus.num9373;

import java.io.*;

public class BaekJoon_2529 {
    static String max = "0";
    static String min = "10000000000";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");

        function(k, 0, 0, 9, s, new boolean[10], "");

        bw.write(max + "\n");
        bw.write(min + "");
        bw.flush();
        bw.close();
    }

    static void function(int k, int depth, int start, int end, String[] s, boolean[] visited, String str) {
        if (depth == k + 1) {
            if (Long.parseLong(max) < Long.parseLong(str)) {
                max = str;
            }
            if (Long.parseLong(min) > Long.parseLong(str)) {
                min = str;
            }
            return;
        }

        for (int i = start; i <= end; i++) {
            if (!visited[i]) {
                visited[i] = true;
                if (depth == k) {
                    function(k, depth + 1, 0, 0, s, visited, str + i);
                } else if (s[depth].equals("<")) {
                    function(k, depth + 1, i + 1, 9, s, visited, str + i);
                } else {
                    function(k, depth + 1, 0, i - 1, s, visited, str + i);
                }
                visited[i] = false;
            }
        }
    }
}
