package org.sparta.baekjoon.codeplus.num9373;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BaekJoon_14889 {
    static int min = 1000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        function(arr, n, 1, new boolean[n], new int[n / 2], 2);

        bw.write(min + "");
        bw.flush();
        bw.close();
    }

    static void function(int[][] arr, int n, int depth, boolean[] bool, int[] player, int idx) {
        if (depth == n / 2) {
            player[0] = 1;
            bool[0] = true;
            min = Math.min(min, getScore(arr, player, bool));
            return;
        }

        for (int i = idx; i <= n; i++) {
            player[depth] = i;
            bool[i - 1] = true;
            function(arr, n, depth + 1, bool, player, i + 1);
            bool[i - 1] = false;
        }
    }

    static int getScore(int[][] arr, int[] player, boolean[] bool) {
        int sumA = 0;
        int sumB = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < player.length * 2; i++) {
            if (!bool[i]) {
                list.add(i + 1);
            }
        }

        for (int i = 0; i < player.length; i++) {
            for (int j = i + 1; j < player.length; j++) {
                sumA += arr[player[i]][player[j]] + arr[player[j]][player[i]];
                sumB += arr[list.get(i)][list.get(j)] + arr[list.get(j)][list.get(i)];
            }
        }
        return Math.abs(sumA - sumB);
    }
}
