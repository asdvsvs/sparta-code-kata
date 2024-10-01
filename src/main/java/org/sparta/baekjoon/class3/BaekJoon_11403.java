package org.sparta.baekjoon.class3;

import java.io.*;
import java.util.*;

public class BaekJoon_11403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, List<Integer>> map = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        int[][] visited = new int[N][N];

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            map.put(i, new ArrayList<>());
            for (int j = 0; j < N; j++) {
                int temp = Integer.parseInt(s[j]);
                if (temp == 1) {
                    map.get(i).add(j);
                }
            }
        }


        for (int i = 0; i < N; i++) {
            queue.add(i);
            while (!queue.isEmpty()) {
                int temp = queue.poll();
                for (int k : map.get(temp)) {
                    if (visited[i][k] == 0) {
                        queue.add(k);
                        visited[i][k] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                bw.write(visited[i][j] + "");
                if (j != N - 1) {
                    bw.write(" ");
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}