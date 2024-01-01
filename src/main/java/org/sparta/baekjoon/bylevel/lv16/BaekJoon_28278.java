package org.sparta.baekjoon.bylevel.lv16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon_28278 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            switch (command) {
                case 1: {
                    stack.push(Integer.valueOf(st.nextToken()));
                    break;
                }
                case 2: {
                    int temp;
                    if (stack.empty()) {
                        temp = -1;
                    } else {
                        temp = stack.pop();
                    }
                    bw.write(temp + "\n");
                    break;
                }
                case 3: {
                    bw.write(stack.size() + "\n");
                    break;
                }
                case 4: {
                    if (stack.empty()) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                    break;
                }
                case 5: {
                    if (!stack.empty()) {
                        bw.write(stack.peek() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
                }
            }
        }

        bw.flush();
        bw.close();
    }

}
