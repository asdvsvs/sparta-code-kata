package org.sparta.baekjoon.class3;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon_2178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            String s = br.readLine();
            for (int j = 1; j <= M; j++) {
                map[i][j] = Integer.parseInt(String.valueOf(s.charAt(j - 1)));
            }
        }

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        int[][] move = new int[N + 1][M + 1];
        Queue<String> queue = new LinkedList<>();
        move[1][1] = 1;
        queue.add(1 + " " + 1);

        while (!queue.isEmpty()) {
            String[] temp = queue.poll().split(" ");
            int x = Integer.parseInt(temp[0]);
            int y = Integer.parseInt(temp[1]);
            for (int i = 0; i < 4; i++) {
                int moveX = x + dx[i];
                int moveY = y + dy[i];
                if (0 <= moveX && moveX <= N && 0 <= moveY && moveY <= M) {
                    if (map[moveX][moveY] == 1) {
                        if (move[moveX][moveY] == 0) {
                            move[moveX][moveY] = move[x][y] + 1;
                            queue.add(moveX + " " + moveY);
                        }
                    }
                }
            }
        }

        bw.write(move[N][M] + "");
        bw.flush();
        bw.close();
    }
}
