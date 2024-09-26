package org.sparta.baekjoon.class3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BaekJoon_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);

        int sum = 0;
        int total = 0;
        for (int i : list) {
            sum += i;
            total += sum;
        }
        bw.write(total + "");
        bw.flush();
        bw.close();
    }
}
