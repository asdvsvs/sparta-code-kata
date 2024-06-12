package org.sparta.baekjoon.codeplus.num9378;

import java.io.*;
import java.util.*;

public class BaekJoon_1260 {
    static List<Integer>[] list;
    static List<Integer> dfsList = new ArrayList<>();
    static List<Integer> bfsList = new ArrayList<>();
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
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

        for (int i = 1; i <= n; i++) {
            Collections.sort(list[i]);
        }

        dfsList.add(v);
        dfs(v);

        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        bfsList.add(v);
        while (true) {
            if (bfsList.size() == n) {
                break;
            }
            if (q.isEmpty()) {
                break;
            }
            int t = q.poll();
            for (int i = 0; i < list[t].size(); i++) {
                int k = list[t].get(i);
                if (!bfsList.contains(k)) {
                    q.add(k);
                    bfsList.add(k);
                }
            }
        }

        for (int i = 0; i < dfsList.size(); i++) {
            if (i == dfsList.size() - 1) {
                bw.write(dfsList.get(i) + "");
            } else {
                bw.write(dfsList.get(i) + " ");
            }
        }
        bw.newLine();
        for (int i = 0; i < bfsList.size(); i++) {
            if (i == bfsList.size() - 1) {
                bw.write(bfsList.get(i) + "");
            } else {
                bw.write(bfsList.get(i) + " ");
            }
        }
        bw.flush();
        bw.close();
    }

    static void dfs(int idx) {
        if (dfsList.size() == n) {
            return;
        }

        for (int i = 0; i < list[idx].size(); i++) {
            int t = list[idx].get(i);
            if (dfsList.size() == n) {
                return;
            }

            if (!dfsList.contains(t)) {
                dfsList.add(t);
                dfs(t);
            }
        }
    }
}
