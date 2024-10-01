package org.sparta.baekjoon.class3;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon_14940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        int[][] distance = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        int[] dy = {-1, 0, 1, 0};
        int[] dx = {0, -1, 0, 1};
        String end = "";
        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                int temp = Integer.parseInt(s[j]);
                if (temp == 2) {
                    end = i + " " + j;
                    visited[i][j] = true;
                }
                map[i][j] = temp;
            }
        }


        queue.add(end);
        while (!queue.isEmpty()) {
            String[] s = queue.poll().split(" ");
            int y = Integer.parseInt(s[0]);
            int x = Integer.parseInt(s[1]);
            for (int i = 0; i < 4; i++) {
                int moveY = y + dy[i];
                int moveX = x + dx[i];
                if (0 <= moveY && 0 <= moveX && moveY < n && moveX < m) {
                    if (map[moveY][moveX] == 1 && !visited[moveY][moveX]) {
                        queue.add(moveY + " " + moveX);
                        distance[moveY][moveX] = distance[y][x] + 1;
                        visited[moveY][moveX] = true;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    bw.write("-1");
                } else {
                    bw.write(distance[i][j] + "");
                }
                if (j != m - 1) {
                    bw.write(" ");
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
