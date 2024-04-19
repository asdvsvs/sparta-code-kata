package org.sparta.baekjoon.bylevel.lv14;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BaekJoon_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> strMap = new HashMap<>();
        Map<Integer, String> numMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            strMap.put(s, i + 1);
            numMap.put(i + 1, s);
        }

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (s.charAt(0) >= 49 && s.charAt(0) <= 57) {
                bw.write(numMap.get(Integer.parseInt(s)) + "\n");
            } else {
                bw.write(strMap.get(s) + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
