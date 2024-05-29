package org.sparta.baekjoon.codeplus.num9373;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BaekJoon_15661 {
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

        for (int i = 2; i < n - 2; i++) {
            function(arr, i, 0, 1, new boolean[n]);
        }

        bw.write(min + "");
        bw.flush();
        bw.close();
    }

    static void function(int[][] arr, int leftTeam, int depth, int idx, boolean[] bool) {
        if (depth == leftTeam) {
            min = Math.min(min, getScore(arr, bool));
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            bool[i - 1] = true;
            function(arr, leftTeam, depth + 1, i + 1, bool);
            bool[i - 1] = false;
        }
    }

    static int getScore(int[][] arr, boolean[] bool) {
        int sumA = 0;
        int sumB = 0;
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (bool[i]) {
                listA.add(i + 1);
            } else {
                listB.add(i + 1);
            }
        }

        for (int i = 0; i < listA.size(); i++) {
            for (int j = i + 1; j < listA.size(); j++) {
                sumA += arr[listA.get(i)][listA.get(j)] + arr[listA.get(j)][listA.get(i)];
            }
        }
        for (int i = 0; i < listB.size(); i++) {
            for (int j = i + 1; j < listB.size(); j++) {
                sumB += arr[listB.get(i)][listB.get(j)] + arr[listB.get(j)][listB.get(i)];
            }
        }
        return Math.abs(sumA - sumB);
    }
}