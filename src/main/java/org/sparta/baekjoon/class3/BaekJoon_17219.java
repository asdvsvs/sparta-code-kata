package org.sparta.baekjoon.class3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BaekJoon_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] arr = s.split(" ");
            map.put(arr[0], arr[1]);
        }

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            bw.write(map.get(s) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
