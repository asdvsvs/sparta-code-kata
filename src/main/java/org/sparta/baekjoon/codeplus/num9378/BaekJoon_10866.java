package org.sparta.baekjoon.codeplus.num9378;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class BaekJoon_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            if (s[0].equals("push_front")) {
                deque.addFirst(Integer.parseInt(s[1]));
            } else if (s[0].equals("push_back")) {
                deque.addLast(Integer.parseInt(s[1]));
            } else if (s[0].equals("size")) {
                bw.write(deque.size() + "\n");
            } else if (s[0].equals("empty")) {
                if (deque.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (deque.isEmpty()) {
                bw.write("-1\n");
            } else {
                if (s[0].equals("pop_front")) {
                    bw.write(deque.pollFirst() + "\n");
                } else if (s[0].equals("pop_back")) {
                    bw.write(deque.pollLast() + "\n");
                } else if (s[0].equals("front")) {
                    bw.write(deque.peekFirst() + "\n");
                } else if (s[0].equals("back")) {
                    bw.write(deque.peekLast() + "\n");
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
