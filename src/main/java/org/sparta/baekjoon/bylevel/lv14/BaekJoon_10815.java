package org.sparta.baekjoon.bylevel.lv14;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BaekJoon_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer stN = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer stM = new StringTokenizer(br.readLine());
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(stN.nextToken()));
        }
        for (int i = 0; i < m; i++) {
            if (set.contains(Integer.parseInt(stM.nextToken()))) {
                bw.write("1");
            } else {
                bw.write("0");
            }
            if (i != m - 1) {
                bw.write(" ");
            }
        }
        bw.flush();
        bw.close();
    }
}
