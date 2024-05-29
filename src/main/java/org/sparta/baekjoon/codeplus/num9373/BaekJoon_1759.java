package org.sparta.baekjoon.codeplus.num9373;
//https://www.acmicpc.net/board/view/117825

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_1759 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        String[] arr = new String[C];
        StringTokenizer stC = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            arr[i] = stC.nextToken();
        }
        Arrays.sort(arr);
        dfs(L, C, arr, 0, 0, "", false, 0);

        bw.flush();
        bw.close();
    }

    static void dfs(int L, int C, String[] arr, int depth, int idx, String s, boolean aeiou, int other) throws IOException {
        if (depth == L) {
            if (aeiou && other >= 2) {
                bw.write(s + "\n");
            }
            return;
        }

        for (int i = idx; i < C; i++) {
            if (arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o") || arr[i].equals("u")) {
                dfs(L, C, arr, depth + 1, i + 1, s + arr[i], true, other);
            } else {
                dfs(L, C, arr, depth + 1, i + 1, s + arr[i], aeiou, other + 1);
            }
        }
    }
}
