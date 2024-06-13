package org.sparta.baekjoon.codeplus.num9378;

import java.io.*;
import java.util.*;

public class BaekJoon_11724 {
    static List<Integer>[] list;
    static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        list = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                set.add(i);
                cnt++;
                dfs(i);
            }
        }

        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }

    static void dfs(int startIdx) {

        for (int i = 0; i < list[startIdx].size(); i++) {
            if (!set.contains(list[startIdx].get(i))) {
                set.add(list[startIdx].get(i));
                dfs(list[startIdx].get(i));
            }
        }
    }
}
