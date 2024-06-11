package org.sparta.baekjoon.codeplus.num9378;

import java.io.*;
import java.util.*;

public class BaekJoon_13023 {
    static Map<Integer, List<Integer>> map = new HashMap<>();
    static boolean bool = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> q = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map.get(a).add(b);
            map.get(b).add(a);
        }

        for (int i = 0; i < n; i++) {
            dfs(1, n, i, new boolean[n]);
            if (bool) {
                break;
            }
        }

        if (bool) {
            bw.write("1");
        } else {
            bw.write("0");
        }

        bw.flush();
        bw.close();
    }

    static void dfs(int depth, int n, int idx, boolean[] visited) {
        if (depth == 5) {
            bool = true;
            return;
        }

        visited[idx] = true;
        for (int j = 0; j < map.get(idx).size(); j++) {
            int k = map.get(idx).get(j);
            if (!visited[k]) {
                visited[k] = true;
                dfs(depth + 1, n, k, visited);
                visited[k] = false;
            }
        }
    }
}