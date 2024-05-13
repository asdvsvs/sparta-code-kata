package org.sparta.baekjoon.bylevel.lv16;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class BaekJoon_28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int command;
            if (s.contains(" ")) {
                String[] str = s.split(" ");
                command = Integer.parseInt(str[0]);
                int x = Integer.parseInt(str[1]);
                if (command == 1) {
                    deque.addFirst(x);
                } else {
                    deque.addLast(x);
                }
            } else {
                command = Integer.parseInt(s);
                if (command == 5) {
                    bw.write(deque.size() + "\n");
                    continue;
                } else if (command == 6) {
                    if (deque.isEmpty()) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    continue;
                }

                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    if (command == 3) {
                        bw.write(deque.pollFirst() + "\n");
                    } else if (command == 4) {
                        bw.write(deque.pollLast() + "\n");
                    } else if (command == 7) {
                        bw.write(deque.peekFirst() + "\n");
                    } else if (command == 8) {
                        bw.write(deque.peekLast() + "\n");
                    }
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
