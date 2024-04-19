package org.sparta.baekjoon.bylevel.lv14;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BaekJoon_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringTokenizer stA = new StringTokenizer(br.readLine());
        StringTokenizer stB = new StringTokenizer(br.readLine());
        Set<Integer> set = new HashSet<>();
        int cnt = 0;
        for (int i = 0; i < a; i++) {
            set.add(Integer.parseInt(stA.nextToken()));
        }
        for (int i = 0; i < b; i++) {
            if (set.contains(Integer.parseInt(stB.nextToken()))) {
                cnt++;
            }
        }
        bw.write(a + b - cnt * 2 + "");
        bw.flush();
        bw.close();
    }
}
