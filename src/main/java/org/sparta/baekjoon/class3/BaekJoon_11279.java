package org.sparta.baekjoon.class3;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class BaekJoon_11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            int X = Integer.parseInt(br.readLine());
            if (X == 0) {
                if (queue.isEmpty()) {
                    bw.write("0\n");
                } else {
                    bw.write(queue.poll() + "\n");
                }
            } else {
                queue.add(X);
            }
        }

        bw.flush();
        bw.close();
    }
}
