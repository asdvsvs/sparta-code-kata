package org.sparta.baekjoon.class3;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon_1012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());


            boolean[][] bool = new boolean[n][m];
            int cnt = 0;

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                bool[y][x] = true;
            }
            for (int a = 0; a < n; a++) {
                for (int b = 0; b < m; b++) {
                    if (bool[a][b]) {
                        cnt++;
                        bool[a][b] = false;
                        queue.add(a + " " + b);
                        while (!queue.isEmpty()) {
                            String[] arr = queue.poll().split(" ");
                            int y = Integer.parseInt(arr[0]);
                            int x = Integer.parseInt(arr[1]);
                            if (x > 0 && bool[y][x - 1]) {
                                queue.add(y + " " + (x - 1));
                                bool[y][x - 1] = false;
                            }
                            if (y > 0 && bool[y - 1][x]) {
                                queue.add((y - 1) + " " + x);
                                bool[y - 1][x] = false;
                            }
                            if (x < m - 1 && bool[y][x + 1]) {
                                queue.add(y + " " + (x + 1));
                                bool[y][x + 1] = false;
                            }
                            if (y < n - 1 && bool[y + 1][x]) {
                                queue.add((y + 1) + " " + x);
                                bool[y + 1][x] = false;
                            }
                        }
                    }
                }
            }
            bw.write(cnt + "\n");
        }

        bw.flush();
        bw.close();
    }
}
