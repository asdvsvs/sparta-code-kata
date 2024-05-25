package org.sparta.baekjoon.codeplus.num9370;
//https://www.acmicpc.net/board/view/101238

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BaekJoon_6588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> input = new ArrayList<>();
        int max = 0;
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            } else {
                max = Math.max(max, n);
                input.add(n);
            }
        }

        boolean[] num = new boolean[max + 1];
        for (int i = 2; i <= Math.sqrt(max); i++) {
            for (int j = i * 2; j < max; j += i) {
                num[j] = true;
            }
        }
        for (int n : input) {
            for (int i = 3; i <= n - 3; i++) {
                if (!num[i] && !num[n - i]) {
                    bw.write(n + " = " + i + " + " + (n - i) + "\n");
                    break;
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
