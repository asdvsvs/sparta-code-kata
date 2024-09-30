package org.sparta.baekjoon.class3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class BaekJoon_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> absQueue = new PriorityQueue<>();
        Map<Integer, Queue<Integer>> queueMap = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (absQueue.isEmpty()) {
                    bw.write("0\n");
                } else {
                    int abs = absQueue.poll();
                    bw.write(queueMap.get(abs).poll() + "\n");
                }

            } else {
                int abs = Math.abs(x);
                absQueue.add(abs);
                if (queueMap.get(abs) == null) {
                    queueMap.put(abs, new PriorityQueue<>());
                }
                queueMap.get(abs).add(x);
            }

        }

        bw.flush();
        bw.close();
    }
}
