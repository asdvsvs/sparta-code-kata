package org.sparta.baekjoon.bylevel.lv16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BaekJoon_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> list = new ArrayList<>();

        while (true) {
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();

            if (s.equals(".")) {
                break;
            }

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '[' || s.charAt(i) == ']') {
                    if (stack.isEmpty()) {
                        stack.add(s.charAt(i));
                    } else if (s.charAt(i) == ')') {
                        if (stack.peek() == '(') {
                            stack.pop();
                        } else {
                            stack.add(s.charAt(i));
                        }
                    } else if (s.charAt(i) == ']') {
                        if (stack.peek() == '[') {
                            stack.pop();
                        } else {
                            stack.add(s.charAt(i));
                        }
                    } else {
                        stack.add(s.charAt(i));
                    }
                }
            }
            if (stack.isEmpty()) {
                list.add("yes");
            } else {
                list.add("no");
            }
        }
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i));
            if (i != list.size() - 1) {
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}
