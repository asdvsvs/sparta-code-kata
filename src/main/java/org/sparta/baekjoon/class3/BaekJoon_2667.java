package org.sparta.baekjoon.class3;

import java.io.*;
import java.util.*;

public class BaekJoon_2667 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        boolean[][] visited = new boolean[N][N];
        Queue<String> queue = new LinkedList<>();
        Map<String, Integer> cntMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(String.valueOf(s.charAt(j)));
            }
        }

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    cntMap.put(i + " " + j, 1);
                    queue.add(i + " " + j);
                    visited[i][j] = true;
                    while (!queue.isEmpty()) {
                        String[] s = queue.poll().split(" ");
                        int X = Integer.parseInt(s[0]);
                        int Y = Integer.parseInt(s[1]);

                        for (int k = 0; k < 4; k++) {
                            int moveX = X + dx[k];
                            int moveY = Y + dy[k];
                            if (0 <= moveX && moveX < N && 0 <= moveY && moveY < N) {
                                if (map[moveX][moveY] == 1 && !visited[moveX][moveY]) {
                                    cntMap.put(i + " " + j, cntMap.get(i + " " + j) + 1);
                                    queue.add(moveX + " " + moveY);
                                    visited[moveX][moveY] = true;
                                }
                            }
                        }
                    }
                }
            }
        }

        bw.write(cntMap.size() + "\n");
        List<Integer> list = new ArrayList<>(cntMap.values());
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
