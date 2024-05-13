package org.sparta.baekjoon.bylevel.lv16;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }
        boolean bool = false;
        while (q.size() > 1) {
            if (!bool) {
                q.poll();
                bool = true;
            } else {
                q.add(q.poll());
                bool = false;
            }
        }

        bw.write(q.peek() + "");
        bw.flush();
        bw.close();
    }
}
