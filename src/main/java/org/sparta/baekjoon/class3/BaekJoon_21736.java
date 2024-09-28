package org.sparta.baekjoon.class3;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon_21736 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Queue<String> queue = new ArrayDeque<>();
        Character[][] arr = new Character[N][M];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                if (s.charAt(j) == 'I') {
                    queue.add(i + " " + j);
                    arr[i][j] = 'X';
                }
                arr[i][j] = s.charAt(j);
            }
        }

        int cnt = 0;

        while (!queue.isEmpty()) {
            String[] XY = queue.poll().split(" ");
            int X = Integer.parseInt(XY[0]);
            int Y = Integer.parseInt(XY[1]);
            if (X > 0 && arr[X - 1][Y] != 'X') {
                if (arr[X - 1][Y] == 'P') {
                    cnt++;
                }
                queue.add((X - 1) + " " + Y);
                arr[X - 1][Y] = 'X';
            }
            if (Y > 0 && arr[X][Y - 1] != 'X') {
                if (arr[X][Y - 1] == 'P') {
                    cnt++;
                }
                queue.add(X + " " + (Y - 1));
                arr[X][Y - 1] = 'X';
            }
            if (X < N - 1 && arr[X + 1][Y] != 'X') {
                if (arr[X + 1][Y] == 'P') {
                    cnt++;
                }
                queue.add((X + 1) + " " + Y);
                arr[X + 1][Y] = 'X';
            }
            if (Y < M - 1 && arr[X][Y + 1] != 'X') {
                if (arr[X][Y + 1] == 'P') {
                    cnt++;
                }
                queue.add(X + " " + (Y + 1));
                arr[X][Y + 1] = 'X';
            }
        }

        if (cnt == 0) {
            bw.write("TT");
        } else {
            bw.write(cnt + "");
        }

        bw.flush();
        bw.close();
    }
}
