package org.sparta.baekjoon.bylevel.lv16;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        int back = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.contains("push")) {
                String[] str = s.split(" ");
                back = Integer.parseInt(str[1]);
                queue.add(back);
            } else if (s.equals("pop")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue.poll() + "\n");
                }
            } else if (s.equals("size")) {
                bw.write(queue.size() + "\n");
            } else if (s.equals("empty")) {
                if (queue.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (s.equals("front")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue.peek() + "\n");
                }
            } else if (s.equals("back")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(back + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
