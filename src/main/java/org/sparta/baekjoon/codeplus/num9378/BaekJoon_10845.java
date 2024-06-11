package org.sparta.baekjoon.codeplus.num9378;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        int last = 0;
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            if (s.length >= 2) {
                int t = Integer.parseInt(s[1]);
                q.add(t);
                last = t;
            } else if (s[0].equals("pop")) {
                if (!q.isEmpty()) {
                    bw.write(q.poll() + "\n");
                } else {
                    bw.write("-1\n");
                }
            } else if (s[0].equals("size")) {
                bw.write(q.size() + "\n");
            } else if (s[0].equals("empty")) {
                if (q.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (s[0].equals("front")) {
                if (!q.isEmpty()) {
                    bw.write(q.peek() + "\n");
                } else {
                    bw.write("-1\n");
                }
            } else if (s[0].equals("back")) {
                if (!q.isEmpty()) {
                    bw.write(last + "\n");
                } else {
                    bw.write("-1\n");
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
