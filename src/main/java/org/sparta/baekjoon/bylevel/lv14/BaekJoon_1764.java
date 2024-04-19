package org.sparta.baekjoon.bylevel.lv14;

import java.io.*;
import java.util.*;

public class BaekJoon_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet<>();
        int cnt = 0;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (set.contains(s)) {
                cnt++;
                list.add(s);
            }
        }
        Collections.sort(list);
        bw.write(cnt + "\n");
        for (String s : list) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
    }
}
