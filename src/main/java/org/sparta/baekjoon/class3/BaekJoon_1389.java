package org.sparta.baekjoon.class3;

import java.io.*;
import java.util.*;

public class BaekJoon_1389 {
    static Map<Integer, Set<Integer>> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= N; i++) {
            map.put(i, new HashSet<>());
        }
        for (int i = 0; i < M; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            map.get(a).add(b);
            map.get(b).add(a);
        }

        int min = 0;
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            boolean[] visited = new boolean[N + 1];
            visited[i] = true;
            Queue<Integer> queue = new LinkedList<>();
            queue.add(i);
            int result = bfs(visited, queue);
            if (i == 1) {
                min = result;
                answer = i;
            } else {
                if (result < min) {
                    min = result;
                    answer = i;
                }
            }
        }
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }

    static int bfs(boolean[] visited, Queue<Integer> queue) {
        int cnt = 0;
        int[] depth = new int[visited.length];
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            for (int i : map.get(temp)) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                    depth[i] = depth[temp] + 1;
                    cnt += depth[i];
                }
            }

        }

        return cnt;
    }
}
