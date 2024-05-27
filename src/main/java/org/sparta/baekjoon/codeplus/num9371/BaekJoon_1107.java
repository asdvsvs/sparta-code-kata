package org.sparta.baekjoon.codeplus.num9371;
//반례
//https://www.acmicpc.net/board/view/142277

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BaekJoon_1107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int channel = 100;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        if (m > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                set.add(st.nextToken());
            }
        }

        int min = Math.abs(n - channel);
        int range = n * 10;
        if (range == 0) {
            range = 10;
        }
        for (int i = 0; i <= range; i++) {
            String s = String.valueOf(i);
            boolean bool = false;
            for (int j = 0; j < s.length(); j++) {
                if (set.contains(String.valueOf(s.charAt(j)))) {
                    bool = true;
                    break;
                }
            }

            if (!bool) {
                int temp = Math.abs(n - i);
                if (min > temp + s.length()) {
                    min = temp + s.length();
                }
            }
        }

        bw.write(min + "\n");
        bw.flush();
        bw.close();
    }
}
