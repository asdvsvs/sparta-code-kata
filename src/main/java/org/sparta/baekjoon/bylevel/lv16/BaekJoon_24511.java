package org.sparta.baekjoon.bylevel.lv16;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BaekJoon_24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] A = br.readLine().split(" ");
        String[] B = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());
        String[] C = br.readLine().split(" ");

        List<String> list = new ArrayList<>();
        Deque<String> deque = new ArrayDeque<>();

        for (int i = 0; i < A.length; i++) {
            if (A[i].equals("0")) {
                deque.add(B[i]);
            }
        }

        for (String s : C) {
            if (deque.isEmpty()) {
                list.add(s);
            } else {
                list.add(deque.pollLast());
                deque.addFirst(s);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {
                bw.write(list.get(i) + " ");
            } else {
                bw.write(list.get(i));
            }
        }
        bw.flush();
        bw.close();
    }
}
