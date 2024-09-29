package org.sparta.baekjoon.class3;

import java.io.*;
import java.util.*;

public class BaekJoon_1931 {
    static int max = 0;
    static Map<Integer, Queue<Integer>> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            int s = Integer.parseInt(str[0]);
            int e = Integer.parseInt(str[1]);
            if (map.get(e) == null) {
                map.put(e, new PriorityQueue<>());
            }
            map.get(e).add(s);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        int endTime = 0;
        for (int i : list) {
            for (int startTime : map.get(i)) {
                if (endTime <= startTime) {
                    endTime = i;
                    max++;
                }
            }
        }

        bw.write(max + "");
        bw.flush();
        bw.close();
    }
}
