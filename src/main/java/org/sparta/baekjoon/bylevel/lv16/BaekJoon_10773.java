package org.sparta.baekjoon.bylevel.lv16;

import java.io.*;
import java.util.Stack;

public class BaekJoon_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n != 0) {
                stack.add(n);
            } else {
                stack.pop();
            }
        }
        int sum = 0;
        for (int i : stack) {
            sum += i;
        }

        bw.write(sum + "");
        bw.flush();
        bw.close();
    }
}

