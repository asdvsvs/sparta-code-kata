package org.sparta.baekjoon.codeplus.num9374;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_6603 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            if (k == 0) {
                break;
            }
            int[] arr = new int[k];
            for (int i = 0; i < k; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            dfs(k, 0, arr, 0, "");
            bw.newLine();
        }


        bw.flush();
        bw.close();
    }

    static void dfs(int k, int depth, int[] arr, int idx, String s) throws IOException {
        if (depth == 6) {
            s = s.substring(0, s.length() - 1);
            bw.write(s + "\n");
            return;
        }

        for (int i = idx; i < k; i++) {
            dfs(k, depth + 1, arr, i + 1, s + arr[i] + " ");
        }
    }
}
