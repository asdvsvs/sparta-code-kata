package org.sparta.baekjoon.class3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class BaekJoon_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            Map<String, Integer> map = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                String s = br.readLine();
                String[] arr = s.split(" ");
                map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
            }
            int ans = 1;
            for (int k : map.values()) {
                ans *= (k + 1);
            }
            ans--;
            bw.write(ans + "\n");
        }

        bw.flush();
        bw.close();
    }
}
