package org.sparta.baekjoon.bylevel.lv16;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon_12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();

        int num = 1;
        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && stack.peek() == num) {
                stack.pop();
                num++;
            }
            if (i != n) {
                int k = Integer.parseInt(st.nextToken());
                if (k == num) {
                    num++;
                } else {
                    stack.add(k);
                }
            }
        }

        if (stack.isEmpty()) {
            bw.write("Nice");
        } else {
            bw.write("Sad");
        }

        bw.flush();
        bw.close();
    }
}
