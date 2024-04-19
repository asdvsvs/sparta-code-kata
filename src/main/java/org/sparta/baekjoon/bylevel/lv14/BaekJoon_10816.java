package org.sparta.baekjoon.bylevel.lv14;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BaekJoon_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer stN = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer stM = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(stN.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(stM.nextToken());
            if (map.containsKey(num)) {
                bw.write(map.get(num) + "");
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
