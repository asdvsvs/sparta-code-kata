package org.sparta.baekjoon.bylevel.lv23;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BaekJoon_1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int plus = 0;
        int minus = 0;
        int max = -1000;
        List<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            max = Math.max(max, num);
            if (num > 0) {
                if (minus < 0) {
                    list.add(minus);
                    minus = 0;
                }
                plus += num;
            } else {
                if (plus > 0) {
                    list.add(plus);
                    plus = 0;
                }
                minus += num;
            }
            if (i == n - 1) {
                if (plus != 0) {
                    list.add(plus);
                }
                if (minus != 0) {
                    list.add(minus);
                }
            }
        }
        int sum = 0;
        for (Integer i : list) {
            if (sum + i > 0) {
                sum += i;
                max = Math.max(max, sum);
            } else {
                sum = 0;
            }
        }

        bw.write(max + "");
        bw.flush();
        bw.close();

    }
}
