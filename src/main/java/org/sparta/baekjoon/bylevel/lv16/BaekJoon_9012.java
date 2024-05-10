package org.sparta.baekjoon.bylevel.lv16;

import java.io.*;
import java.util.Stack;

public class BaekJoon_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            Stack<Character> stack = new Stack<>();
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                if (stack.isEmpty() || s.charAt(j) == '(') {
                    stack.add(s.charAt(j));
                } else {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.add(s.charAt(j));
                    }
                }
            }

            if (stack.isEmpty()) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
