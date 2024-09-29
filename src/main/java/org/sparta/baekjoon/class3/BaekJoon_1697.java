package org.sparta.baekjoon.class3;

import java.io.*;
import java.util.*;

public class BaekJoon_1697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        queue.add(N);
        map.put(N, 0);

        while (!queue.isEmpty()) {
            int position = queue.poll();
            if (position == K) {
                break;
            }
            if (N < K) {
                if (position < K) {
                    if (map.get(position * 2) == null) {
                        map.put(position * 2, map.get(position) + 1);
                        queue.add(position * 2);
                    }
                    if (map.get(position + 1) == null) {
                        map.put(position + 1, map.get(position) + 1);
                        queue.add(position + 1);
                    }
                }
            }
            if (map.get(position - 1) == null) {
                map.put(position - 1, map.get(position) + 1);
                queue.add(position - 1);
            }
        }

        bw.write(map.get(K) + "");
        bw.flush();
        bw.close();
    }
}
