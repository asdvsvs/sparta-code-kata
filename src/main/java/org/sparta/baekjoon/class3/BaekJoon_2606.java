package org.sparta.baekjoon.class3;

import java.io.*;
import java.util.*;

public class BaekJoon_2606 {
    static Map<Integer, List<Integer>> map = new HashMap<>();
    static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int linked = Integer.parseInt(br.readLine());

        for (int i = 0; i < linked; i++) {
            String s = br.readLine();
            String[] arr = s.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            if (map.get(a) == null) {
                map.put(a, new ArrayList<>());
            }
            if (map.get(b) == null) {
                map.put(b, new ArrayList<>());
            }
            map.get(a).add(b);
            map.get(b).add(a);
        }
        if (map.get(1) != null) {
            func(1, map.get(1), new boolean[n + 1]);
        }

        set.remove(1);
        bw.write(set.size() + "");
        bw.flush();
        bw.close();
    }

    public static void func(int n, List<Integer> list, boolean[] visited) {

        for (int i : list) {
            if (!visited[i]) {
                visited[i] = true;
                set.add(i);
                func(i, map.get(i), visited);
            }
        }
    }
}
